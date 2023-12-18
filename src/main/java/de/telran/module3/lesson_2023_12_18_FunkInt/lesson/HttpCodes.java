package de.telran.module3.lesson_2023_12_18_FunkInt.lesson;

public enum HttpCodes {
    INFORMATIONAL(100,199,
            (code,codes)-> System.out.println(code + " interval "+ codes)), // 100-199
    SUCCESS(200,299,
            (code,codes)-> System.out.println(code + " interval "+ codes)), // 200-299
    REDIRECTION(300,399,
            (code,codes)-> System.out.println(code + " interval "+ codes)), // 300-399
    CLIENT_ERROR(400,499,
            (code,codes)-> System.out.println(code + " interval "+ codes)), // 400-499
    SERVER_ERROR(500,599,
            (code,codes)-> System.out.println(code + " interval "+ codes));//500-599

    int minCode;
    int maxCode;
    Action valAction;

    HttpCodes(int minCode, int maxCode, Action action) {
        this.minCode = minCode;
        this.maxCode = maxCode;
        this.valAction = action;
    }

    public static void findValueByCode(int code){
        for (HttpCodes v: HttpCodes.values()) {
            if(code>=v.minCode && code<= v.maxCode) {
                v.doIt(code, v);
                break;
            }
        }
    }

    public  void doIt(int code, HttpCodes v){
        if(valAction != null){
            valAction.action(code, v);
        }
    }
}
