package cs1302.ce10;

import java.util.Date;

/**
 * Represents a Homework assignment in the cs1302 mock eLC
 * application.
 *
 * @author Brad Barnes
 * @version 1.0; Feb 9 2019
 */
public class Homework {

    /** Total point value for this homework. */
    private int totalPoints;
    /** Indicates if this is a bonus assignment. */
    private boolean isBonus;
    /** Course where this homework is assigned. */
    private Course course;
    /** Due date of this homework assignment. */
    private Date dueDate;

    /**
     * Constructs a new {@code Homework} object with the specified
     * arguments.
     *
     * @param points the total points allocated to this homework.
     * @param bonus indicates if this is a bonus homework.
     * @param course the course where this homework is assigned.
     * @param dueDate the {@code java.util.Date} this homework is due.
     *
     * @throws IllegalArgumentException if {@code points} is negative
     * or if {@code dueDate} or {@code course} is {@code null}.
     */
    public Homework(int points, boolean bonus, Course course,
                    Date dueDate) {
        nullCheck("Homework", course, dueDate);

        if (points < 0) {
            throw new IllegalArgumentException("Homework Constructor: " +
                                               "Invalid homework point total");
        } // if
        this.isBonus = bonus;
        this.totalPoints = points;
        this.course = course;
        this.dueDate = dueDate;
    } // Homework

    /**
     * Updates the point total associated with this homework.
     *
     * @param points the new point total.
     * @throws IllegalArgumentException if {@code points}
     * is negative.
     */
    public void setPoints(int points) {
        if (points < 0) {
            throw new IllegalArgumentException("Homework Constructor: " +
                                               "Invalid homework point total");
        } // if
        this.totalPoints = points;
    } // setPoints

    /**
     * Updates whether or not this homework is a bonus assignment.
     *
     * @param bonus the bonus indicator.
     */
    public void setBonus(boolean bonus) {
        this.isBonus = bonus;
    } // setBonus

    /**
     * Updates the due date of this homework assignment.
     *
     * @param due the new due {@code java.util.Date}.
     * @throws NullPointerException if {@code due} is {@code null}.
     */
    public void setDueDate(Date due) {
        nullCheck("setDueDate", due);
        this.dueDate = due;
    } // setDueDate

    /**
     * Returns the due date of this homework assignment.
     *
     * @return the {@code java.util.Date} this homework is due.
     */
    public Date getDueDate() {
        return this.dueDate;
    } // getDueDate

    /**
     * Returns whether or not this homework is bonus.
     *
     * @return if this homework is a bonus assignment.
     */
    public boolean isBonus() {
        return isBonus;
    } // isBonus

    /**
     * Returns the number of points associated with this homework
     * assignment.
     *
     * @return the points associated with this {@code Homework} object.
     */
    public int getPoints() {
        return totalPoints;
    } // getPoints

    /**
     * Returns the course in which this homework is assigned.
     *
     * @return the {@link cs1302.ce10.Course} that assigned this
     * homework.
     */
    public Course getCourse() {
        return course;
    } // getCourse

    /**
     * Throws a NullPointerException if any values in the
     * varargs parameter, {@code o} are {@code null}. The
     * method performs no actions if all values in {@code o}
     * are non-null.
     *
     * @param method the name of the calling method.
     * @param o varargs parameter containing all objects to verify
     * @throws NullPointerException if any element of parameter
     * {@code o} is null.
     */
    private void checkNull(String method, Object ... o) {
        for (Object obj: o) {
            if (o == null) {
                throw new NullPointerException(method +
                                               ": Null Argument Provided");
            } // if
        } // for
    } // checkNull

} // Homework
