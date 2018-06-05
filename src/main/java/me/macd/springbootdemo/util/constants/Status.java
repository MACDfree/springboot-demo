package me.macd.springbootdemo.util.constants;

public enum Status {
    valid("1"),
    invalid("0"),
    disabled("9");

    private String status;
    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
