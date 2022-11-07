public class Main {
    public static class Clock{
        int hour;
        int minute;
        Clock(){
            this.hour = 0;
            this.minute = 0;
        }
        Clock(int hour, int minute){
            this.hour = hour;
            this.minute = minute;
            if(hour<0) this.hour = 0;
            else if (hour>23) this.hour = 0;
            else if (minute <0) this.minute = 0;
            else if (minute>59) {
                this.minute = 0;
                this.hour += 1;
            }
        }
        void setClock(int hour, int minute){
            this.hour = hour;
            this.minute = minute;
        }
        void setClock(){
            this.hour = 0;
            this.minute = 0;
        }
        void displayTime(){
            System.out.println("Hour: "+ this.hour +"minute: "+this.minute);
        }
        void addOneMinute(){
            this.minute+=1;
        }
    }

    public static void main(String[] args) {
        Clock c = new Clock(12,47);
        c.displayTime();
        c.setClock(18,14);
        c.displayTime();
        c.setClock(9,3);
        c.displayTime();
        c.setClock(23,58);
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
        c.addOneMinute();
        c.displayTime();
    }
}