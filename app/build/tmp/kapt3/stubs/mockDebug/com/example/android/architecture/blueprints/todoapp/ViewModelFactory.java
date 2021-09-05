package com.example.android.architecture.blueprints.todoapp;

import java.lang.System;

/**
 * Factory for all ViewModels.
 */
@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ5\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/android/architecture/blueprints/todoapp/ViewModelFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "tasksRepository", "Lcom/example/android/architecture/blueprints/todoapp/data/source/TasksRepository;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "defaultArgs", "Landroid/os/Bundle;", "(Lcom/example/android/architecture/blueprints/todoapp/data/source/TasksRepository;Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "app_mockDebug"})
public final class ViewModelFactory extends androidx.lifecycle.AbstractSavedStateViewModelFactory {
    private final com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository tasksRepository = null;
    
    public ViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository tasksRepository, @org.jetbrains.annotations.NotNull()
    androidx.savedstate.SavedStateRegistryOwner owner, @org.jetbrains.annotations.Nullable()
    android.os.Bundle defaultArgs) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handle) {
        return null;
    }
}