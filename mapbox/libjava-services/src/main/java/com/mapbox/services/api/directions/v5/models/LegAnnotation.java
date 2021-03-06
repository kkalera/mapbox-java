package com.mapbox.services.api.directions.v5.models;

/**
 * An annotations object that contains additional details about each line segment along the route geometry. Each entry
 * in an annotations field corresponds to a coordinate along the route geometry.
 *
 * @since 2.1.0
 */
public class LegAnnotation {

  private double[] distance;
  private double[] duration;
  private double[] speed;
  private String[] congestion;

  public LegAnnotation() {
  }

  /**
   * The distance, in meters, between each pair of coordinates.
   *
   * @return a double array with each entry being a distance value between two of the routeLeg geometry coordinates.
   * @since 2.1.0
   */
  public double[] getDistance() {
    return distance;
  }

  /**
   * Set the duration, in seconds, between each pair of coordinates.
   *
   * @param distance a double array with each entry being a duration value between two of the routeLeg geometry
   *                 coordinates.
   * @since 2.2.0
   */
  public void setDistance(double[] distance) {
    this.distance = distance;
  }

  /**
   * The duration, in seconds, between each pair of coordinates.
   *
   * @return a double array with each entry being a duration value between two of the routeLeg geometry coordinates.
   * @since 2.1.0
   */
  public double[] getDuration() {
    return duration;
  }

  /**
   * Set the duration, in seconds, between each pair of coordinates.
   *
   * @param duration a double array with each entry being a duration value between two of the routeLeg geometry
   *                 coordinates.
   * @since 2.2.0
   */
  public void setDuration(double[] duration) {
    this.duration = duration;
  }

  /**
   * The speed, in meters per second, between each pair of coordinates.
   *
   * @return a double array with each entry being a speed value between two of the routeLeg geometry coordinates.
   * @since 2.1.0
   */
  public double[] getSpeed() {
    return speed;
  }

  /**
   * Set the speed, in meters per second, between each pair of coordinates.
   *
   * @param speed a double array with each entry being a speed value between two of the routeLeg geometry coordinates.
   * @since 2.2.0
   */
  public void setSpeed(double[] speed) {
    this.speed = speed;
  }

  /**
   * The congestion between each pair of coordinates.
   *
   * @return a String array with each entry being a congestion value between two of the routeLeg geometry coordinates.
   * @since 2.2.0
   */
  public String[] getCongestion() {
    return congestion;
  }

  /**
   * Set the congestion between each pair of coordinates.
   *
   * @param congestion a String array with each entry being a congestion value between two of the routeLeg geometry
   *                   coordinates.
   * @since 2.2.0
   */
  public void setCongestion(String[] congestion) {
    this.congestion = congestion;
  }
}
