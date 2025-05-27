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
 * @see [ClassicTreeLayout.edgeRoutingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayoutEdgeRoutingStyle">Online Documentation</a>
 */
@JsName("ClassicTreeLayoutEdgeRoutingStyle")
external sealed class EdgeRoutingStyle: YEnum<EdgeRoutingStyle> {
   companion object: EnumMetadata<EdgeRoutingStyle> {
       /**
 * A constant for routing the edges as straight-line segments.
 * 
 * Value - `0`
 * @see [ClassicTreeLayout.edgeRoutingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayoutEdgeRoutingStyle%23PLAIN">Online Documentation</a>
 */
val PLAIN: EdgeRoutingStyle

/**
 * A constant for routing the edges orthogonally in a bus-like fashion.
 * 
 * Value - `1`
 * @see [ClassicTreeLayout.edgeRoutingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayoutEdgeRoutingStyle%23ORTHOGONAL">Online Documentation</a>
 */
val ORTHOGONAL: EdgeRoutingStyle
   }
}
