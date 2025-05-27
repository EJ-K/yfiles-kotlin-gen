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
 * The handle of a segment of a borderline.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLineSegment">Online Documentation</a>
 */
external open class BorderLineSegment  : YObject {

/**
 * Gets the end of this segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLineSegment%23end">Online Documentation</a>
 */
open val end: Double
/**
 * Returns the segment's value at the given position.
 * @param [position] the position the value is retrieved for.
 * @return the segment's value at the given position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLineSegment%23BorderLineSegment-method-getValueAt">Online Documentation</a>
 */
 open   fun getValueAt( position: Int ):Double
/**
 * Returns the next segment or `null` if there is no such segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLineSegment%23BorderLineSegment-method-next">Online Documentation</a>
 */
 final   fun next():BorderLineSegment?
/**
 * Returns the previous segment or `null` if there is no such segment.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BorderLineSegment%23BorderLineSegment-method-prev">Online Documentation</a>
 */
 final   fun prev():BorderLineSegment?

companion object : ClassMetadata<BorderLineSegment> {
}
}
