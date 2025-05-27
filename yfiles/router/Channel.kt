// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.YRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class describes a channel, i.e., a set of vertical or horizontal edge segments whose locations depend on each other.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel">Online Documentation</a>
 * 
 * @constructor Creates a new [Channel] that contains the given [segment info][SegmentInfo].
 * @param [segment] the given segment info for which the [Channel] is created
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23Channel-constructor-Channel">Online Documentation</a>
 */
external open class Channel  ( segment: SegmentInfo ) : YObject {

/**
 * Gets the bounds of this [channel][Channel].
 * @see [widthInterval]
 * @see [lengthInterval]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23bounds">Online Documentation</a>
 */
open val bounds: YRectangle
/**
 * Gets an [interval][Interval] spanning the union of the maximum extension of the [segment infos][SegmentInfo].
 * @see [SegmentInfoBase.maxExtension]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23lengthInterval">Online Documentation</a>
 */
open val lengthInterval: Interval
/**
 * Gets whether or not the segments in this [channel][Channel] are vertical.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23vertical">Online Documentation</a>
 */
open val vertical: Boolean
/**
 * Gets an [interval][Interval] spanning the union of the location ranges of the [segment infos][SegmentInfo].
 * @see [SegmentInfoBase.locationRange]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23widthInterval">Online Documentation</a>
 */
open val widthInterval: Interval
/**
 * Adds a new [segment info][SegmentInfo] to the [channel][Channel].
 * @param [segment] the segment info to be added to this channel
 * @throws ArgumentError if the given segment has a different orientation than the other segments already contained in the channel
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23Channel-method-addSegment">Online Documentation</a>
 */
 open   fun addSegment( segment: SegmentInfo )
/**
 * Adds a [segment group][SegmentGroup] to this [channel][Channel].
 * @param [group] the segment group to be added
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23Channel-method-addSegmentGroup">Online Documentation</a>
 */
 open   fun addSegmentGroup( group: SegmentGroup )
/**
 * Returns the current location that the given [segment info][SegmentInfo] has been assigned within its [location range][SegmentInfoBase.locationRange].
 * @param [segmentInfo] the segment info for which the current location will be returned
 * @return the current location of the segment info or [Double.NaN] if no location has been assigned before
 * @see [setCurrentLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23Channel-method-getCurrentLocation">Online Documentation</a>
 */
 open   fun getCurrentLocation( segmentInfo: SegmentInfo ):Double
/**
 * Returns the [segment info][SegmentInfo] with the given index in the list of segments of this [channel][Channel].
 * @param [index] the index of the segment in the list of segments
 * @return the [segment info][SegmentInfo] with the given index in the list of segments
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23Channel-method-getSegment">Online Documentation</a>
 */
 open   fun getSegment( index: Int ):SegmentInfo
/**
 * Returns the [segment group][SegmentGroup] with the given index in this [channel][Channel].
 * @param [index] the index of the segment group
 * @return the [segment group][SegmentGroup] with the given index in this channel
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23Channel-method-getSegmentGroup">Online Documentation</a>
 */
 open   fun getSegmentGroup( index: Int ):SegmentGroup
/**
 * Returns the number of [segment infos][SegmentInfo] in this channel.
 * @return the number of segment infos in this channel
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23Channel-method-segmentCount">Online Documentation</a>
 */
 open   fun segmentCount():Int
/**
 * Returns the number of [segment groups][SegmentGroup] in this [channel][Channel].
 * @return the number of segment groups in this channel
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23Channel-method-segmentGroupCount">Online Documentation</a>
 */
 open   fun segmentGroupCount():Int
/**
 * Specifies the current location that the given [segment info][SegmentInfo] has been assigned within its [location range][SegmentInfoBase.locationRange].
 * @param [segmentInfo] the segment info for which the current location will be set
 * @param [location] the location of the segment info within its location range
 * @see [SegmentInfoBase.location]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Channel%23Channel-method-setCurrentLocation">Online Documentation</a>
 */
 open   fun setCurrentLocation( segmentInfo: SegmentInfo ,
 location: Double )

companion object : ClassMetadata<Channel> {
}
}
