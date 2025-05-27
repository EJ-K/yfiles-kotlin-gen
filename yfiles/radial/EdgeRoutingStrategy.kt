// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.radial

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [RadialLayout.edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutEdgeRoutingStrategy">Online Documentation</a>
 */
@JsName("RadialLayoutEdgeRoutingStrategy")
external sealed class EdgeRoutingStrategy: YEnum<EdgeRoutingStrategy> {
   companion object: EnumMetadata<EdgeRoutingStrategy> {
       /**
 * Specifier for an edge routing strategy that will route edges with polyline segments from source to target with one bend on each spanned circle.
 * 
 * Value - `1`
 * @see [RadialLayout.edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutEdgeRoutingStrategy%23POLYLINE">Online Documentation</a>
 */
val POLYLINE: EdgeRoutingStrategy

/**
 * Specifier for an edge routing strategy that will route edges as arcs.
 * 
 * Value - `5`
 * @see [RadialLayout.edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutEdgeRoutingStrategy%23ARC">Online Documentation</a>
 */
val ARC: EdgeRoutingStrategy

/**
 * Specifier for an edge routing strategy that will route edges a series of straight and arc segments.
 * 
 * Value - `6`
 * @see [RadialLayout.edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutEdgeRoutingStrategy%23RADIAL_POLYLINE">Online Documentation</a>
 */
val RADIAL_POLYLINE: EdgeRoutingStrategy

/**
 * Specifier for an edge routing strategy that will route edges as curved bezier paths.
 * 
 * Value - `7`
 * @see [RadialLayout.edgeRoutingStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutEdgeRoutingStrategy%23CURVED">Online Documentation</a>
 */
val CURVED: EdgeRoutingStrategy
   }
}
