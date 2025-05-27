// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [MultiParentDescriptor.edgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentRoutingStyle">Online Documentation</a>
 */
external sealed class MultiParentRoutingStyle: YEnum<MultiParentRoutingStyle> {
   companion object: EnumMetadata<MultiParentRoutingStyle> {
       /**
 * Routing style for routing non-shared edge segments in a polyline fashion.
 * 
 * Value - `0`
 * @see [MultiParentDescriptor.edgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentRoutingStyle%23POLYLINE">Online Documentation</a>
 */
val POLYLINE: MultiParentRoutingStyle

/**
 * Routing style for routing non-shared edge segments in an orthogonal fashion.
 * 
 * Value - `1`
 * @see [MultiParentDescriptor.edgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentRoutingStyle%23ORTHOGONAL">Online Documentation</a>
 */
val ORTHOGONAL: MultiParentRoutingStyle

/**
 * Routing style for routing non-shared edge segments straight.
 * 
 * Value - `2`
 * @see [MultiParentDescriptor.edgeStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiParentRoutingStyle%23STRAIGHT">Online Documentation</a>
 */
val STRAIGHT: MultiParentRoutingStyle
   }
}
