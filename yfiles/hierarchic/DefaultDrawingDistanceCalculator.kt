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
 * This class is a default [IDrawingDistanceCalculator] implementation that is used by [HierarchicLayoutCore] to configure the [INodePlacer].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultDrawingDistanceCalculator">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [DefaultDrawingDistanceCalculator] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultDrawingDistanceCalculator%23DefaultDrawingDistanceCalculator-constructor-DefaultDrawingDistanceCalculator">Online Documentation</a>
 */
external open class DefaultDrawingDistanceCalculator  () : IDrawingDistanceCalculator {

/**
 * Gets or sets whether or not an adaptive minimum edge distance is used.
 * 
 * Default value - `true`. An adaptive minimum distance is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultDrawingDistanceCalculator%23adaptiveMinimumEdgeDistanceEnabled">Online Documentation</a>
 */
open var adaptiveMinimumEdgeDistanceEnabled: Boolean
/**
 * Gets or sets whether or not the compaction option is enabled.
 * 
 * Default value - `false`. Compaction is disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultDrawingDistanceCalculator%23compaction">Online Documentation</a>
 */
open var compaction: Boolean
/**
 * Gets or sets the minimum distance between two edges.
 * 
 * Default value - `20.0`
 * @throws ArgumentError if the minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultDrawingDistanceCalculator%23edgeToEdgeDistance">Online Documentation</a>
 */
open var edgeToEdgeDistance: Double
/**
 * Gets or sets the minimum distance between a [Node] and an (non-adjacent) [Edge][yfiles.algorithms.Edge].
 * 
 * Default value - `15.0`
 * @throws ArgumentError if the minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultDrawingDistanceCalculator%23nodeToEdgeDistance">Online Documentation</a>
 */
open var nodeToEdgeDistance: Double
/**
 * Gets or sets the minimum distance between two [Node]s.
 * 
 * Default value - `30.0`
 * @throws ArgumentError if the minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultDrawingDistanceCalculator%23nodeToNodeDistance">Online Documentation</a>
 */
open var nodeToNodeDistance: Double
/**
 * Gets or sets whether or not to use an optimized minimum distance calculation for swimlane layouts.
 * 
 * Default value - `false`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultDrawingDistanceCalculator%23optimizeSwimlaneDistances">Online Documentation</a>
 */
open var optimizeSwimlaneDistances: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultDrawingDistanceCalculator%23DefaultDrawingDistanceCalculator-method-dispose">Online Documentation</a>
 */
 override   fun dispose( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )
/**
 * Determines the minimum distance between two [Node]s of the same layer.
 * @param [graph] the input graph
 * @param [layer] the [ILayer] object that will be used during subsequent calls
 * @param [ldp] the [ILayoutDataProvider] used for querying information
 * @param [left] the left of the two [Node]s whose minimum distance is to be determined or `null` if only the left border of the right [Node] is of interest
 * @param [right] the right of the two [Node]s whose minimum distance is to be determined or `null` if only the right border of the left [Node] is of interest
 * @return the minimum distances between [Node]s of same layer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultDrawingDistanceCalculator%23DefaultDrawingDistanceCalculator-method-getMinDistance">Online Documentation</a>
 */
 override   fun getMinDistance( graph: LayoutGraph ,
 layer: ILayer ,
 ldp: ILayoutDataProvider ,
 left: Node? ,
 right: Node? ):Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultDrawingDistanceCalculator%23DefaultDrawingDistanceCalculator-method-initialize">Online Documentation</a>
 */
 override   fun initialize( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )

companion object : ClassMetadata<DefaultDrawingDistanceCalculator> {
}
}

inline fun DefaultDrawingDistanceCalculator(
    block: DefaultDrawingDistanceCalculator.() -> Unit
): DefaultDrawingDistanceCalculator {
    return DefaultDrawingDistanceCalculator()
        .apply(block)
}
