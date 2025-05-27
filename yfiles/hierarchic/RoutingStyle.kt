// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.CurveConnectionStyle

/**
 * This class is used by [EdgeLayoutDescriptor] to specify the routing style for different types of edges.
 * @see [EdgeLayoutDescriptor.routingStyle]
 * @see [IEdgeData.type]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance of a [RoutingStyle] with the default values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23RoutingStyle-constructor-RoutingStyle()">Online Documentation</a>
 */
@JsName("HierarchicLayoutRoutingStyle")
external open class RoutingStyle  () : YObject {
/**
 * Creates a new [RoutingStyle] instance with the given routing style for each edge and, optionally, also specifying whether or not the resulting path should consist of cubic bezier control points.
 * @param [routingStyle] one of the predefined routing styles
 * @param [controlPointCreation] `true` if the resulting path should consist of cubic bezier control points, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23RoutingStyle-constructor-RoutingStyle(EdgeRoutingStyle,boolean)">Online Documentation</a>
 */
 constructor( routingStyle: EdgeRoutingStyle ,
 controlPointCreation: Boolean  = definedExternally)

/**
 * Gets or sets the routing style for back-loop edges.
 * @throws ArgumentError if an unknown routing style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23backLoopRoutingStyle">Online Documentation</a>
 */
open var backLoopRoutingStyle: EdgeRoutingStyle
/**
 * Gets or sets whether or not the points of the resulting edge path represent cubic bezier control points.
 * 
 * Default value - `false`. Each point is a normal polyline bend point.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23createControlPoints">Online Documentation</a>
 */
open var createControlPoints: Boolean
/**
 * Gets or sets whether or not [curved][EdgeRoutingStyle.CURVED] edges may shortcut and introduce additional edge crossings to make curves more direct and smoother.
 * 
 * Default value - `false`. Curved edges do not shortcut.
 * @see [EdgeRoutingStyle.CURVED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23curveShortcuts">Online Documentation</a>
 */
open var curveShortcuts: Boolean
/**
 * Gets or sets how symmetric u-turn parts of [curved][EdgeRoutingStyle.CURVED] routes should preferably be.
 * 
 * Default value - `0`. The symmetry of u-turns is not specifically optimized.
 * @throws ArgumentError if the given symmetry value is negative or larger than one
 * @see [EdgeRoutingStyle.CURVED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23curveUTurnSymmetry">Online Documentation</a>
 */
open var curveUTurnSymmetry: Double
/**
 * Gets or sets the default routing style for edges that have no individual routing style.
 * @throws ArgumentError if an unknown routing style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23defaultEdgeRoutingStyle">Online Documentation</a>
 */
open var defaultEdgeRoutingStyle: EdgeRoutingStyle
/**
 * Gets or sets the routing style for grouped edges at the common segments.
 * @throws ArgumentError if an unknown routing style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23edgeGroupRoutingStyle">Online Documentation</a>
 */
open var edgeGroupRoutingStyle: EdgeRoutingStyle
/**
 * Gets or sets the routing style for same-layer edges.
 * @throws ArgumentError if an unknown routing style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23sameLayerEdgeRoutingStyle">Online Documentation</a>
 */
open var sameLayerEdgeRoutingStyle: EdgeRoutingStyle
/**
 * Gets or sets the routing style for self-loops.
 * @throws ArgumentError if an unknown routing style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23selfLoopRoutingStyle">Online Documentation</a>
 */
open var selfLoopRoutingStyle: EdgeRoutingStyle
/**
 * Gets or sets the style which determines how curved edge paths connect at the source side of the edge.
 * 
 * Default value - [CurveConnectionStyle.KEEP_PORT]. The hierarchic source port and the first segment is kept.
 * @throws ArgumentError if an unknown connection style is given
 * @see [targetCurveConnectionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23sourceCurveConnectionStyle">Online Documentation</a>
 */
open var sourceCurveConnectionStyle: CurveConnectionStyle
/**
 * Gets or sets the style which determines how curved edge paths connect at the target side of the edge.
 * 
 * Default value - [CurveConnectionStyle.KEEP_PORT]. The hierarchic target port and the last segment is kept.
 * @throws ArgumentError if an unknown connection style is given
 * @see [sourceCurveConnectionStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutRoutingStyle%23targetCurveConnectionStyle">Online Documentation</a>
 */
open var targetCurveConnectionStyle: CurveConnectionStyle

companion object : ClassMetadata<RoutingStyle> {
}
}
