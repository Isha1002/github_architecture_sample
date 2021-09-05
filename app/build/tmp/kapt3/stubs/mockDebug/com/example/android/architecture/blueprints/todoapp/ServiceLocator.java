package com.example.android.architecture.blueprints.todoapp;

import java.lang.System;

/**
 * A Service Locator for the [TasksRepository]. This is the mock version, with a
 * [FakeTasksRemoteDataSource].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0016\u001a\u00020\u0017H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/android/architecture/blueprints/todoapp/ServiceLocator;", "", "()V", "database", "Lcom/example/android/architecture/blueprints/todoapp/data/source/local/ToDoDatabase;", "lock", "<set-?>", "Lcom/example/android/architecture/blueprints/todoapp/data/source/TasksRepository;", "tasksRepository", "getTasksRepository", "()Lcom/example/android/architecture/blueprints/todoapp/data/source/TasksRepository;", "setTasksRepository", "(Lcom/example/android/architecture/blueprints/todoapp/data/source/TasksRepository;)V", "createDataBase", "context", "Landroid/content/Context;", "inMemory", "", "createTaskLocalDataSource", "Lcom/example/android/architecture/blueprints/todoapp/data/source/TasksDataSource;", "createTasksRepository", "provideTasksRepository", "resetRepository", "", "app_mockDebug"})
public final class ServiceLocator {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.android.architecture.blueprints.todoapp.ServiceLocator INSTANCE = null;
    private static final java.lang.Object lock = null;
    private static com.example.android.architecture.blueprints.todoapp.data.source.local.ToDoDatabase database;
    @org.jetbrains.annotations.Nullable()
    private static volatile com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository tasksRepository;
    
    private ServiceLocator() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository getTasksRepository() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setTasksRepository(@org.jetbrains.annotations.Nullable()
    com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository provideTasksRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository createTasksRepository(android.content.Context context) {
        return null;
    }
    
    private final com.example.android.architecture.blueprints.todoapp.data.source.TasksDataSource createTaskLocalDataSource(android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    public final com.example.android.architecture.blueprints.todoapp.data.source.local.ToDoDatabase createDataBase(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean inMemory) {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void resetRepository() {
    }
}