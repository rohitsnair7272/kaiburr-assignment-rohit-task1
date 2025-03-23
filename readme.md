# **Kaiburr Task Manager - CRUD REST API with Spring Boot & MongoDB**

**Author:** Rohit S Nair

---

## **Table of Contents**

1. [Project Overview](#project-overview)
2. [Tech Stack](#tech-stack)
3. [Setup & Installation](#setup--installation)
   - [1. Prerequisites](#1-prerequisites)
   - [2. Clone the Repository](#2-clone-the-repository)
   - [3. Install Dependencies](#3-install-dependencies)
   - [4. MongoDB Setup using Compass](#4-mongodb-setup-using-compass)
   - [5. Run the Spring Boot Application](#5-run-the-spring-boot-application)
4. [API Endpoints & Postman Testing](#api-endpoints--postman-testing)
5. [Screenshots](#screenshots)
6. [Common Issues & Debugging](#common-issues--debugging)
7. [Final Notes](#final-notes)

---

## **Project Overview**

This is a **Task Manager REST API** built with **Spring Boot** and **MongoDB** to perform CRUD operations. It supports:  
✅ Creating, retrieving, updating, and deleting tasks  
✅ Searching tasks by name  
✅ Executing tasks  
✅ Storing execution history

---

## **Tech Stack**

- **Backend:** Spring Boot (Java)
- **Database:** MongoDB (using MongoDB Compass)
- **Build Tool:** Maven
- **API Testing Tool:** Postman

---

## **Setup & Installation**

### **1. Prerequisites**

Ensure you have the following installed:  
✅ **Java 17**  
✅ **Maven**  
✅ **MongoDB & MongoDB Compass**  
✅ **Postman**

#### **Checking Java & Maven Installation**

To verify Java installation, run:

```sh
java -version
```

Expected Output:

```
java version "17.0.x"
```

To verify Maven installation, run:

```sh
mvn -version
```

Expected Output:

```
Apache Maven 3.x.x
```

#### **Installing MongoDB Compass**

Download and install:

- **MongoDB Compass**: [Download](https://www.mongodb.com/try/download/compass)

---

### **2. Clone the Repository**

```sh
git clone https://github.com/yourusername/kaiburr-task-manager.git
cd kaiburr-task-manager
```

📸 **(Screenshot Placeholder: Cloning Repository & Navigating into Project Folder)**

---

### **3. Install Dependencies**

Navigate to the project directory and install dependencies using Maven:

```sh
mvn clean install
```

📸 **(Screenshot Placeholder: Running Maven Install Command)**

---

### **4. MongoDB Setup using Compass**

#### **Step 1: Open MongoDB Compass**

1. Launch **MongoDB Compass**
2. Click **"Connect"** and use the **default localhost connection (`mongodb://localhost:27017`)**

#### **Step 2: Create Database & Collection**

1. Click **"Create Database"**
2. Enter **Database Name:** `task_manager`
3. Enter **Collection Name:** `tasks`
4. Click **"Create Database"**

📸 **(Screenshot Placeholder: Creating Database & Collection in MongoDB Compass)**

#### **Step 3: Verify Database Creation**

1. Click on `task_manager` → `tasks`
2. The collection should be empty

📸 **(Screenshot Placeholder: Empty Task Collection in MongoDB Compass)**

---

### **5. Run the Spring Boot Application**

1. Open a terminal in the project root folder
2. Run the application using Maven:
   ```sh
   mvn spring-boot:run
   ```
3. The API will start at `http://localhost:8080`

📸 **(Screenshot Placeholder: Running Spring Boot Application in Terminal)**

---

## **API Endpoints & Postman Testing**

### **1. Create a Task**

**Endpoint:**

```
POST /tasks
```

**Request Body (JSON):**

```json
{
  "id": "task1",
  "name": "Check Server Health",
  "owner": "Admin",
  "command": "ping -c 4 google.com"
}
```

**Expected Response:**

```json
{
  "id": "task1",
  "name": "Check Server Health",
  "owner": "Admin",
  "command": "ping -c 4 google.com",
  "status": "created"
}
```

📸 **(Screenshot Placeholder: Postman - Creating a Task)**

---

### **2. Get All Tasks**

**Endpoint:**

```
GET /tasks
```

📸 **(Screenshot Placeholder: Postman - Get All Tasks Response)**

---

### **3. Get Task by ID**

**Endpoint:**

```
GET /tasks/task1
```

📸 **(Screenshot Placeholder: Postman - Get Task by ID Response)**

---

### **4. Update a Task**

**Endpoint:**

```
PUT /tasks/task1
```

**Request Body:**

```json
{
  "name": "Updated Task Name",
  "owner": "New Owner",
  "command": "uptime"
}
```

📸 **(Screenshot Placeholder: Postman - Updating a Task)**

---

### **5. Delete a Task**

**Endpoint:**

```
DELETE /tasks/task1
```

📸 **(Screenshot Placeholder: Postman - Deleting a Task)**

---

### **6. Search Task by Name**

**Endpoint:**

```
GET /tasks/search?name=Server
```

📸 **(Screenshot Placeholder: Postman - Searching a Task by Name)**

---

### **7. Execute a Task**

**Endpoint:**

```
PUT /tasks/task1/execute
```

📸 **(Screenshot Placeholder: Postman - Executing a Task)**

---

### **8. Fetch Execution History**

**Endpoint:**

```
GET /tasks/history
```

📸 **(Screenshot Placeholder: Postman - Fetch Execution History Response)**

---

## **Screenshots**

### **1. MongoDB Compass**

- Database & Collection Created
- Tasks Collection View

### **2. Terminal Commands**

- Running `mvn install`
- Running `mvn spring-boot:run`

### **3. Postman API Testing**

- Create Task
- Get All Tasks
- Get Task by ID
- Update Task
- Delete Task
- Search Task
- Execute Task
- Fetch Execution History

📸 **(Screenshots to be inserted after each step)**

---

## **Common Issues & Debugging**

### **1. MongoDB Connection Failed**

- Ensure MongoDB is running:
  ```sh
  mongod
  ```
- Check Compass connection

### **2. Spring Boot Port Already in Use**

- Kill the process using the port:
  ```sh
  kill -9 $(lsof -t -i:8080)
  ```

### **3. Compilation Errors**

- Run:
  ```sh
  mvn clean install
  ```

---

## **Final Notes**

✅ All steps covered in **extreme detail**  
✅ Includes **MongoDB Compass setup**  
✅ **Postman API testing screenshots** placeholders  
✅ **GitHub repository structure & README.md guidelines followed**
