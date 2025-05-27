// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class can be used to easily model an orthogonal border line or sky-line.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine">Online Documentation</a>
 * 
 * @constructor Creates a new [BorderLine] with the given value from -[Double.MAX_VALUE] to +[Double.MAX_VALUE].
 * @param [value] the value of the segment
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-constructor-BorderLine(number)">Online Documentation</a>
 */
external open class BorderLine  ( value: Double ) : YObject {
/**
 * Creates a new [BorderLine] from a single segment.
 * @param [min] the beginning of this borderline
 * @param [max] the ending of this borderline
 * @param [value] the value of the segment
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-constructor-BorderLine(number,number,number)">Online Documentation</a>
 */
 constructor( min: Double ,
 max: Double ,
 value: Double )
/**
 * Creates a new [BorderLine] from a single segment.
 * @param [min] the beginning of this borderline
 * @param [max] the ending of this borderline
 * @param [valueAtMin] the value of the segment at the beginning of this borderline
 * @param [valueAtMax] the value of the segment at the ending of this borderline
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-constructor-BorderLine(number,number,number,number)">Online Documentation</a>
 */
 constructor( min: Double ,
 max: Double ,
 valueAtMin: Double ,
 valueAtMax: Double )

/**
 * Gets the greatest position of this borderline
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23max">Online Documentation</a>
 */
open val max: Double
/**
 * Gets the maximum value that is set on this borderline
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23maxValue">Online Documentation</a>
 */
open val maxValue: Double
/**
 * Gets the smallest position of this borderline
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23min">Online Documentation</a>
 */
open val min: Double
/**
 * Gets the minimum value that is set on this borderline
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23minValue">Online Documentation</a>
 */
open val minValue: Double
/**
 * Adds the given offset to the segments' positions.
 * @param [delta] the delta to add to the positions
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-addOffset">Online Documentation</a>
 */
 open   fun addOffset( delta: Double )
/**
 * Adds the given offset to the current values of the whole borderline.
 * @param [delta] the delta to add to the values
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-addValueOffset">Online Documentation</a>
 */
 open   fun addValueOffset( delta: Double )
/**
 * Convenience method that copies the actual data from the given argument to this instance.
 * @param [other] the argument to retrieve the values from
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-adoptValues">Online Documentation</a>
 */
 open   fun adoptValues( other: BorderLine )
/**
 * Creates a copy of this borderline.
 * @param [negateValues] whether the values are negated
 * @param [negateOffsets] whether the offsets are negated
 * @return the copy of the borderline
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-createCopy">Online Documentation</a>
 */
 open   fun createCopy( negateValues: Boolean ,
 negateOffsets: Boolean ):BorderLine
/**
 * Merges this borderline with the given borderline using the "maximum" policy.
 * @param [other] the other borderline
 * @return a new borderline that is the result of the merge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-createMax">Online Documentation</a>
 */
 open   fun createMax( other: BorderLine ):BorderLine
/**
 * Merges this borderline with the given borderline using the "minimum" policy.
 * @param [other] the other borderline
 * @return a new borderline that is the result of the merge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-createMin">Online Documentation</a>
 */
 open   fun createMin( other: BorderLine ):BorderLine
/**
 * Returns the first segment or `null` if there is no such segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-firstSegment">Online Documentation</a>
 */
 open   fun firstSegment():BorderLineSegment?
/**
 * Calculates the minimal distance between this borderline and the other one.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-getDistanceTo">Online Documentation</a>
 */
 open   fun getDistanceTo( greater: BorderLine ):Double
/**
 * Returns the maximum position of the given segment.
 * @param [s] the segment
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-getMax">Online Documentation</a>
 */
 open   fun getMax( s: BorderLineSegment ):Double
/**
 * Calculates the maximum value in the interval from->to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-getMaxValue">Online Documentation</a>
 */
 open   fun getMaxValue( from: Double ,
 to: Double ):Double
/**
 * Returns the minimum position of the given segment.
 * @param [s] the segment
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-getMin">Online Documentation</a>
 */
 open   fun getMin( s: BorderLineSegment ):Double
/**
 * Calculates the minimum value in the interval from->to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-getMinValue">Online Documentation</a>
 */
 open   fun getMinValue( from: Double ,
 to: Double ):Double
/**
 * Returns the segment at the given position.
 * @param [pos] the position
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-getSegmentAt">Online Documentation</a>
 */
 open   fun getSegmentAt( pos: Double ):BorderLineSegment?
/**
 * Returns the slope of the given segment.
 * @param [s] the segment
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-getSlope">Online Documentation</a>
 */
 open   fun getSlope( s: BorderLineSegment ):Double
/**
 * Returns the value of the minimum of the given segment.
 * @param [s] the segment
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-getValue">Online Documentation</a>
 */
 open   fun getValue( s: BorderLineSegment ):Double
/**
 * Returns the value that is set on this borderline at the specified position.
 * @param [pos] the position
 * @return the value
 * @throws IndexOutOfRangeError if the position is outside of the borderline.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-getValueAt(number)">Online Documentation</a>
 */
 open   fun getValueAt( pos: Double ):Double
/**
 * Returns the value that is set on this borderline at the specified position.
 * @param [cell] The list cell containing the segment whose value shall be returned.
 * @param [pos] the position
 * @return the value
 * @throws ArgumentError if `pos` is outside the segment's range that is stored in `cell`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-getValueAt(ListCell,number)">Online Documentation</a>
 */
 open   fun getValueAt( cell: ListCell<BorderLineSegment> ,
 pos: Double ):Double
/**
 * Returns the value that is set on this borderline at the specified position.
 * @param [segment] The segment whose value shall be returned.
 * @param [pos] the position where the value will be retrieved.
 * @return the value
 * @throws ArgumentError if `pos` is outside the segment's range.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-getValueAt(BorderLineSegment,number)">Online Documentation</a>
 */
 open   fun getValueAt( segment: BorderLineSegment ,
 pos: Double ):Double
/**
 * Grows this borderline horizontally, so that the [values][getValueAt] of the borderline stay the same however their [start][getMin] and [end][getMax] points are moved in the direction of `toMin` and `toMax`.
 * @param [toMin] the delta by which the border should be extended towards -Infinity
 * @param [toMax] the delta by which the border should be extended towards +Infinity
 * @param [positive] whether the borderline should be interpreted to point in positive direction. This influences the direction into which a segment's border is extended.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-grow">Online Documentation</a>
 */
 open   fun grow( toMin: Double ,
 toMax: Double ,
 positive: Boolean )
/**
 * Returns the last segment or `null` if there is no such segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-lastSegment">Online Documentation</a>
 */
 open   fun lastSegment():BorderLineSegment?
/**
 * Merges this borderline with the given borderline using the "maximum" policy.
 * @param [other] the other borderline
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-mergeWithMax">Online Documentation</a>
 */
 open   fun mergeWithMax( other: BorderLine )
/**
 * Merges this borderline with the given borderline using the "minimum" policy.
 * @param [other] the other borderline
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-mergeWithMin">Online Documentation</a>
 */
 open   fun mergeWithMin( other: BorderLine )
/**
 * Returns the next segment or `null` if there is no such segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-next">Online Documentation</a>
 */
 open   fun next( s: BorderLineSegment ):BorderLineSegment?
/**
 * Returns the previous segment or `null` if there is no such segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-prev">Online Documentation</a>
 */
 open   fun prev( s: BorderLineSegment ):BorderLineSegment?
/**
 * Assures that all values in the given interval are greater or equal than the given value.
 * @param [min] the lower end of the interval
 * @param [max] the upper end of the interval
 * @param [value] the smallest possible value for the interval
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-setMaxValue">Online Documentation</a>
 */
 open   fun setMaxValue( min: Double ,
 max: Double ,
 value: Double )
/**
 * Assures that all values in the given interval are less or equal than the given value.
 * @param [min] the lower end of the interval
 * @param [max] the upper end of the interval
 * @param [value] the greatest possible value for the interval
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-setMinValue">Online Documentation</a>
 */
 open   fun setMinValue( min: Double ,
 max: Double ,
 value: Double )
/**
 * Sets a specific interval to a slope starting at a given value.
 * @param [min] the left side of the interval.
 * @param [max] the right side of the interval.
 * @param [value] the value at `min` where the slope starts.
 * @param [slope] the slope of the segment in the given interval.
 * @throws ArgumentError if `min` is greater than `max`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-setSloped">Online Documentation</a>
 */
 open   fun setSloped( min: Double ,
 max: Double ,
 value: Double ,
 slope: Double )
/**
 * Sets a specific interval described by `min` and `max` to a given value.
 * @param [min] the left side of the interval.
 * @param [max] the right side of the interval.
 * @param [value] the value for the whole interval.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLine%23BorderLine-method-setValue">Online Documentation</a>
 */
 open   fun setValue( min: Double ,
 max: Double ,
 value: Double )

companion object : ClassMetadata<BorderLine> {
}
}
