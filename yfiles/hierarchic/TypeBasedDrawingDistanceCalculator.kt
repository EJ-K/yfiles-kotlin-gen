// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Node
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This class is a [IDrawingDistanceCalculator] implementation that returns the minimum distances for each kind of node pair based on their type as returned by [INodeData.type].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypeBasedDrawingDistanceCalculator">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [TypeBasedDrawingDistanceCalculator] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypeBasedDrawingDistanceCalculator%23TypeBasedDrawingDistanceCalculator-constructor-TypeBasedDrawingDistanceCalculator">Online Documentation</a>
 */
external open class TypeBasedDrawingDistanceCalculator  () : IDrawingDistanceCalculator {

/**
 * Gets or sets whether or not the compaction option is enabled.
 * 
 * Default value - `false`. Compaction is disabled.
 * @see [SimplexNodePlacer.nodeCompaction]
 * @see [SimplexNodePlacer.labelCompaction]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypeBasedDrawingDistanceCalculator%23compaction">Online Documentation</a>
 */
open var compaction: Boolean
/**
 * Gets or sets the minimum distance between two edges.
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypeBasedDrawingDistanceCalculator%23edgeToEdgeDistance">Online Documentation</a>
 */
open var edgeToEdgeDistance: Double
/**
 * Gets or sets the minimum length of the first segment of the edge path (at the source node).
 * 
 * Default value - `15.0`
 * @throws ArgumentError if the minimum length of the first segment is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypeBasedDrawingDistanceCalculator%23minimumFirstSegmentLength">Online Documentation</a>
 */
open var minimumFirstSegmentLength: Double
/**
 * Gets or sets the minimum distance between a [Node] and an (non-adjacent) [Edge][yfiles.algorithms.Edge].
 * 
 * Default value - `15.0`
 * @throws ArgumentError if the minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypeBasedDrawingDistanceCalculator%23nodeToEdgeDistance">Online Documentation</a>
 */
open var nodeToEdgeDistance: Double
/**
 * Gets or sets the minimum distance between two [Node]s.
 * 
 * Default value - `30.0`
 * @throws ArgumentError if the minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypeBasedDrawingDistanceCalculator%23nodeToNodeDistance">Online Documentation</a>
 */
open var nodeToNodeDistance: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypeBasedDrawingDistanceCalculator%23TypeBasedDrawingDistanceCalculator-method-dispose">Online Documentation</a>
 */
 override   fun dispose( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypeBasedDrawingDistanceCalculator%23TypeBasedDrawingDistanceCalculator-method-getMinDistance">Online Documentation</a>
 */
 override   fun getMinDistance( graph: LayoutGraph ,
 layer: ILayer ,
 ldp: ILayoutDataProvider ,
 left: Node? ,
 right: Node? ):Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TypeBasedDrawingDistanceCalculator%23TypeBasedDrawingDistanceCalculator-method-initialize">Online Documentation</a>
 */
 override   fun initialize( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )

companion object : ClassMetadata<TypeBasedDrawingDistanceCalculator> {
}
}

inline fun TypeBasedDrawingDistanceCalculator(
    block: TypeBasedDrawingDistanceCalculator.() -> Unit
): TypeBasedDrawingDistanceCalculator {
    return TypeBasedDrawingDistanceCalculator()
        .apply(block)
}
