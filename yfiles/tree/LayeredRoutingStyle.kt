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
 * @see [LayeredNodePlacer.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredRoutingStyle">Online Documentation</a>
 */
external sealed class LayeredRoutingStyle: YEnum<LayeredRoutingStyle> {
   companion object: EnumMetadata<LayeredRoutingStyle> {
       /**
 * Routing style specifier which defines that edges consist of one straight segment.
 * 
 * Value - `0`
 * @see [LayeredNodePlacer.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredRoutingStyle%23STRAIGHT">Online Documentation</a>
 */
val STRAIGHT: LayeredRoutingStyle

/**
 * Routing style specifier which defines that edges are routed in an orthogonal, bus-like fashion.
 * 
 * Value - `1`
 * @see [LayeredNodePlacer.routingStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredRoutingStyle%23ORTHOGONAL">Online Documentation</a>
 */
val ORTHOGONAL: LayeredRoutingStyle
   }
}
