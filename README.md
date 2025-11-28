# Task Tracker Project

## Overview
The **Task Tracker** is a console-based Java application that allows users to **manage tasks efficiently**. It supports **adding, updating, deleting, and tracking progress** of tasks. Each task is tracked with **ID, description, status, created time, and updated time**.

The project demonstrates **OOP principles, enum usage, Java Collections, Streams, and LocalDateTime**.

---

## Features

### Add Task
- Add a new task with a description.
- Task is automatically assigned a **unique ID**.
- Status is set to **Todo** initially.
- Creation and update timestamps are recorded.

### Update Task Description
- Update the description of an existing task by ID.
- Updated timestamp is modified automatically.

### Delete Task
- Delete a task by ID.
- Safe deletion using `removeIf` on the task list.

### Update Task Progress
- Update the status of a task to **Todo, InProgress, or Done**.
- Status uses **enum** for type safety.
- Updated timestamp is recorded.

### View All Tasks
- Display all tasks with complete details including **ID, description, status, createdAt, updatedAt**.

### View Done Tasks
- Filter and display only tasks with status **Done**.
- If no task is done, a message is shown.

### Safe Input Handling
- Uses **Scanner** to read user input.
- Enum values are handled safely to avoid runtime exceptions.

---

## Project Structure
