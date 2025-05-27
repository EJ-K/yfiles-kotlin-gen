// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents a group of segments of different edges that shall be combined at their common source or target.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentGroup">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [SegmentGroup] that contains the given segments and a range to place them.
 * @param [commonLocationRange] the location range of the given [SegmentInfo]s
 * @param [segmentInfos] the list containing the grouped [SegmentInfo]s
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentGroup%23SegmentGroup-constructor-SegmentGroup">Online Documentation</a>
 * 
 * @property commonLocationRange
 * Gets the common location range for the [segments][segmentInfos] in this group.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentGroup%23commonLocationRange">Online Documentation</a>
 * 
 * @property segmentInfos
 * Gets the list of [SegmentInfo]s contained in this group.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentGroup%23segmentInfos">Online Documentation</a>
 */
external open class SegmentGroup  (
open val commonLocationRange: Interval,
open val segmentInfos: IList<out SegmentInfo>) : YObject {

/**
 * Gets the common [SegmentInfo] representing the grouped segments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentGroup%23commonSegmentInfo">Online Documentation</a>
 */
open val commonSegmentInfo: SegmentInfo

companion object : ClassMetadata<SegmentGroup> {
}
}
