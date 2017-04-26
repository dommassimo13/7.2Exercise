/**
 * Created by dominicmassimo on 4/26/17.
 */
public class Day {
    private String [] day = {"Monday", "Tuesday","Wednesday", "Thursday","Friday","Saturday","Sunday"};
        private int index;
        private boolean error = false;

    /**
     * Sets the initial index of day to 0
     * @return 0 or monday
     */
    public Day() {
        index = 0; //0=monday
    }
    /**
     * lets user set value of the day through the index
     * @param day
     * @param index
     * @param i
     */

    public Day(String day){
        int i = indexOfDay(day);
        if(i!=7) {
            this.index = i;
        }else{
            error=true;
        }
    }

        /**
         * this sets the index of 0-6 to the array of days mon-sun
         * @param i
         * @param day
         * @param index 0-6
         */

        private int indexOfDay(String day){
            int i=0;
            while(i<this.day.length){
                if(this.day[i].equals(day)){
                    return i;
                }
                i++;
            }
            return i;
    }
    /**
     * this method will get the day that the user set in their object
     * @param day
     * @return the day user has set
     */
    public String getDay(){
        return day[this.index];
    }
    /**
     * sets the day through the index 0-6
     * @param i
     * @param day
     */
        public void setDay(String day){
            int i = indexOfDay(day);
            if (i != 7) {
                this.index = i;
            }else{
                error = true;
            }
        }
    /**
     * this method calculates and returns the next day
     * @return next day
     */
        public String nextDay(){
            return day[(this.index+1)%7];
        }
    /**
     * this wil calc the previous day
     * @param i
     * @return previous day
     */

        public String previousDay(){
            int i =(this.index==0)?(this.day.length-1):(this.index-1);
            return day[i];
        }
    /**
     * this method will calculate the day after a certain # of days has been added
     * @param i
     * @param days
     * @return days after
     */

        public String calculateDay(int days){
            int i;
            if (days>=0) {
                i = (this.index + 1) % 7; // when days are >=0
            }else {
                    i =(this.index==0)?(7-Math.abs(days)%7):(this.index+(7-Math.abs(days%7)));

            }
                return day[i];
        }
    /**
     * print the phrase "Current day is " and the day based on the 0-6 index
     * @return the above phrase
     */

        public String toString() {
            return "Current Day is " +day[this.index];
        }
}

