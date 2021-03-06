/*
 * Copyright 2017, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.architecture.blueprints.todoapp.addedittask

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.android.architecture.blueprints.todoapp.R
import com.example.android.architecture.blueprints.todoapp.util.showSnackBar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

/**
 * Main UI for the add task screen. Users can enter a task title and description.
 */


var button_date: Button? = null
var textview_date: TextView? = null
var cal = Calendar.getInstance()
class AddEditTaskFragment : Fragment(), AddEditTaskContract.View {

    override lateinit var presenter: AddEditTaskContract.Presenter
    override var isActive = false
        get() = isAdded

    private lateinit var title: TextView
    private lateinit var description: TextView
    private lateinit var date:TextView

    override fun onResume() {
        super.onResume()
        presenter.start()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.findViewById<FloatingActionButton>(R.id.fab_edit_task_done)?.apply {
            setImageResource(R.drawable.ic_done)
            setOnClickListener {
                presenter.saveTask(title.text.toString(), description.text.toString())
            }
        }
        activity?.findViewById<TextView>(R.id.add_date_picker)?.apply {
            setOnClickListener {
                DatePickerDialog(this@MainActivity,
                    dateSetListener,
                    // set DatePickerDialog to point to today's date when it loads up
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()


                presenter.saveTask(date.text.toString(), description.text.toString())
            })
        }
        val dateSetListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int,
                                   dayOfMonth: Int) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDateInView()
            }
        }

    }
    private fun updateDateInView() {
        val myFormat = "MM/dd/yyyy" // mention the format you need
        val sdf = SimpleDateFormat(myFormat, Locale.US)
        textview_date!!.text = sdf.format(cal.getTime())
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.addtask_frag, container, false)
        with(root) {
            title = findViewById(R.id.add_task_title)
            description = findViewById(R.id.add_task_description)
            date=findViewById(R.id.add_date_picker)
        }
        setHasOptionsMenu(true)
        return root
    }

    override fun showEmptyTaskError() {
        title.showSnackBar(getString(R.string.empty_task_message), Snackbar.LENGTH_LONG)
    }

    override fun showTasksList() {
        activity?.apply {
            setResult(Activity.RESULT_OK)
            finish()
        }
    }

    override fun setTitle(title: String) {
        this.title.text = title
    }

    override fun setDescription(description: String) {
        this.description.text = description
    }

    companion object {
        const val ARGUMENT_EDIT_TASK_ID = "EDIT_TASK_ID"

        fun newInstance(taskId: String?) =
                AddEditTaskFragment().apply {
                    arguments = Bundle().apply {
                        putString(AddEditTaskFragment.ARGUMENT_EDIT_TASK_ID, taskId)
                    }
                }
    }
}
