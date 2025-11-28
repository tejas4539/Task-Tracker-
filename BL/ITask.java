package BL;
public interface ITask {
	String addTask(String description);
	String updateTask(int id,String description);
	String deleteTask(int id);
	String updateProgress(int id,pojo.Status status);
	void getAllTask();
	void getDoneTask();
}
