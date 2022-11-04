# Mongo-db-atlas
Mongo database atlas with AWS


## To save the data to the database. <br/>
http://localhost:8080/task <br/>
Request Body: <br/>
{ <br/>
  "assignee": "Arif Khan", <br/>
  "priority": "2", <br/>
  "description": "Implement Spring Security" <br/>
}<br/>

## To get the list of task from the database.<br/>
http://localhost:8080/task/ <br/>

## To get the list of task based on the assignee. <br/>
http://localhost:8080/task/{assignee} <br/>

## To get the list of task based on the priority. <br/>
http://localhost:8080/task/priority/{priority} <br/>

## To update the task <br/>
http://localhost:8080/task/ <br/>
  { <br/>
        "id": "9c204a08", <br/>
        "assignee": "Arif Khan", <br/>
        "priority": "3", <br/>
        "description": "Add Payment functionality" <br/>
  }<br/>
  
## To delete the task from the database <br/>
http://localhost:8080/task/taskId <br/>



![image](https://user-images.githubusercontent.com/42522100/199896426-10dfa54f-9945-4968-9428-5016c6e5709f.png)






