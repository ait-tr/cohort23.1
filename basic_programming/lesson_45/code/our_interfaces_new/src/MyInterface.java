public interface MyInterface {
    int getUserID();//стандартный метод в интерфейсе

    default int getAdminID(){
        return 1;
    }
  //  int getAdminID();


}
