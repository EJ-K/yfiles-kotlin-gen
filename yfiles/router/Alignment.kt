// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Alignments for segments routed by the [EdgeRouter].
 * @see [SegmentInfoBase.preferredAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Alignment">Online Documentation</a>
 */
external sealed class Alignment: YEnum<Alignment> {
   companion object: EnumMetadata<Alignment> {
       /**
 * A constant specifying that the segment prefers to be placed close to the lower bound of its location range.
 * 
 * Value - `-1`
 * @see [SegmentInfoBase.preferredAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Alignment%23MIN">Online Documentation</a>
 */
val MIN: Alignment

/**
 * A constant specifying that the segment can be placed anywhere within its location range.
 * 
 * Value - `0`
 * @see [SegmentInfoBase.preferredAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Alignment%23ANY">Online Documentation</a>
 */
val ANY: Alignment

/**
 * A constant specifying that the segment prefers to be placed close to the upper bound of its location range.
 * 
 * Value - `1`
 * @see [SegmentInfoBase.preferredAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Alignment%23MAX">Online Documentation</a>
 */
val MAX: Alignment
   }
}
