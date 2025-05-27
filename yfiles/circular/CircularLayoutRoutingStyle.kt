// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Routing style enumeration for edges within and between partitions.
 * @see [EdgeLayoutDescriptor.betweenCirclesRoutingStyle]
 * @see [EdgeLayoutDescriptor.inCircleRoutingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutRoutingStyle">Online Documentation</a>
 */
external sealed class CircularLayoutRoutingStyle: YEnum<CircularLayoutRoutingStyle> {
   companion object: EnumMetadata<CircularLayoutRoutingStyle> {
       /**
 * A routing style constant specifying that edges inside or between partitions should be straight lines.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutRoutingStyle%23STRAIGHT">Online Documentation</a>
 */
val STRAIGHT: CircularLayoutRoutingStyle

/**
 * A routing style constant specifying that edges inside or between partitions should be curved.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CircularLayoutRoutingStyle%23CURVED">Online Documentation</a>
 */
val CURVED: CircularLayoutRoutingStyle
   }
}
