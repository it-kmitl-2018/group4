package model;

public class AdaptedDemoModel {
    
    private DemoModel demoModel;

    public AdaptedDemoModel() {
        demoModel = new DemoModel();
    }
    
    public String getUser() {
        return demoModel.getUser();
    }

    public void setUser(String user) {
        demoModel.setUser(user);
    }

    public int getMoney() {
        return demoModel.getMoney();
    }

    public void setMoney(int money) {
        demoModel.setMoney(money);
    }
}
