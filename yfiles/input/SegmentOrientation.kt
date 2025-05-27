// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration for possible orientations of a segment in a (partially) orthogonal edge routing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentOrientation">Online Documentation</a>
 */
external sealed class SegmentOrientation: YEnum<SegmentOrientation> {
   companion object: EnumMetadata<SegmentOrientation> {
       /**
 * The segment has a horizontal orientation, which means that the end points should be moved vertically in synch so that the orientation is not destroyed.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentOrientation%23HORIZONTAL">Online Documentation</a>
 */
val HORIZONTAL: SegmentOrientation

/**
 * The segment has a vertical orientation, which means that the end points should be moved horizontally in synch so that the orientation is not destroyed.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentOrientation%23VERTICAL">Online Documentation</a>
 */
val VERTICAL: SegmentOrientation

/**
 * The segment does not need to be treated especially, both endpoints can be moved independently from each other.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SegmentOrientation%23NON_ORTHOGONAL">Online Documentation</a>
 */
val NON_ORTHOGONAL: SegmentOrientation
   }
}
