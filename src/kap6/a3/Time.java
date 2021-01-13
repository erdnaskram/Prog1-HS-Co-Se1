package kap6.a3;

import java.text.DecimalFormat;

public class Time {
    private int hour;     // 0 - 23
    private int minute;   // 0 - 59
    private int second;   // 0 - 59

    public Time()
    {
        setTime( 0, 0, 0 );
    }

    public Time( int h )
    {
        setTime( h, 0, 0 );
    }

    public Time( int h, int m )
    {
        setTime( h, m, 0 );
    }

    public Time( int h, int m, int s )
    {
        setTime( h, m, s );
    }

    public Time( Time time )
    {
        setTime( time.getHour(), time.getMinute(),
                time.getSecond() );
    }

    public void setTime( int h, int m, int s )
    {
        setHour( h );    // set the hour
        setMinute( m );  // set the minute
        setSecond( s );  // set the second
    }

    public void setHour( int h )
    {
        hour = ( ( h >= 0 && h < 24 ) ? h : 0 );
    }

    public void setMinute( int m )
    {
        minute = ( ( m >= 0 && m < 60 ) ? m : 0 );
    }

    public void setSecond( int s )
    {
        second = ( ( s >= 0 && s < 60 ) ? s : 0 );
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public int getSecond()
    {
        return second;
    }

    public void incrementMinute()
    {
       minute++;
    }

    public void incrementHour()
    {
        hour++;
    }

    public void tick(){
        second++;
        if(second == 60){
            second = 0;
            minute++;
            if(minute == 60){
                minute = 0;
                hour++;
                if(hour == 24){
                    hour = 0;
                }
            }
        }


    }


    public String toString()
    {
        DecimalFormat twoDigits = new DecimalFormat( "00" );

        return ( ( getHour() == 12 || getHour() == 0 ) ?
                12 : getHour() % 12 ) + ":" +
                twoDigits.format( getMinute() ) + ":" +
                twoDigits.format( getSecond() ) +
                ( getHour() < 12 ? " AM" : " PM" );
    }

}

