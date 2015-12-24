package com.wildstartech.wfa.location;

public interface DistanceMeasurement {
  /**
   * Indicates the results of a distance calculations should be conveyed using
   * meters.
   */
  public enum UNITS {
    IMPERIAL,           // Distance expressed using miles.
    METRIC,             // Distance expressed using kilometers.
    NAUTICAL            // Distance expressed using nautical miles.
  };
  public String IMPERIAL_LABEL="miles";
  public String IMPERIAL_ABBREVIATION="MI";
  public String METRIC_LABEL="kilometers";
  public String METRIC_ABBREVIATION="km";
  public String NAUTICAL_LABEL="nautical miles";
  public String NAUTICAL_ABBREVIATION="nm";
  
  /** 
   * Returns the numerical portion of the distance measurement.
   * @return
   */
  public double getMeasurement();
  /**
   * Returns the measurement as the speicifed unit.
   */
  public double getMeasurementAs(UNITS units);
  
  /**
   * Stores the numerical portion of the distance measurement.
   * @param measurement
   */
  public void setMeasurement(double measurement);
  /**
   * Returns the units used to represent the distance.
   * @return One of the <code>UNITS</code> enumerated values.
   */
  public UNITS getUnits();
  /**
   * Set the type of unit used for the measurement specified.
   * @param unit
   */
  public void setUnits(UNITS unit);
  
  /**
   * Returns the default unit of measurement appropriate for the current locale.
   */
  public UNITS getDefaultUnitOfMeasurement();
  
  /**
   * Returns the measurement as a human-readable, formatted <code>String</code>.
   */
  public String toFormattedString();
}