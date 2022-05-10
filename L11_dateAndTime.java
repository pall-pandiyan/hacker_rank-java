public class L11_dateAndTime  {
    public static String getDay(String day, String month, String year)  {
        String result = new String();
        try {
            String fullDate = day+"/"+month+"/"+year; 
            java.util.Date dt1 = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(fullDate);
            result = new java.text.SimpleDateFormat("EEEEE").format(dt1);
        }
        catch(Exception e) { }
        return result.toUpperCase();
    }