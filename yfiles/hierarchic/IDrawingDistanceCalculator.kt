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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.layout.LayoutGraph

/**
 * This interface determines the minimum distances between elements that belong to the same layer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDrawingDistanceCalculator">Online Documentation</a>
 */
external interface IDrawingDistanceCalculator : YObject {
/**
 * Disposes of internal data structures.
 * @param [graph] the input graph that contains all elements that are used during the node placement
 * @param [layers] the [ILayers] object that will be used during subsequent calls
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @see [initialize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDrawingDistanceCalculator%23IDrawingDistanceCalculator-method-dispose">Online Documentation</a>
 */
   fun dispose( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )
/**
 * Main interface method called by [INodePlacer] instances to determine the minimum distance between [Node]s of same layer.
 * @param [graph] the input graph
 * @param [layer] the [ILayer] object that will be used during subsequent calls
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [left] the left of the two [Node]s whose minimum distance is to be determined or `null` if only the left border of the right [Node] is of interest
 * @param [right] the right of the two [Node]s whose minimum distance is to be determined or `null` if only the right border of the left [Node] is of interest
 * @return the minimum distance between two [Node]s of the same layer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDrawingDistanceCalculator%23IDrawingDistanceCalculator-method-getMinDistance">Online Documentation</a>
 */
   fun getMinDistance( graph: LayoutGraph ,
 layer: ILayer ,
 ldp: ILayoutDataProvider ,
 left: Node? ,
 right: Node? ):Double
/**
 * Initializes internal data structures.
 * @param [graph] the input graph that contains all elements that are used during the node placement
 * @param [layers] the [ILayers] object that will be used during subsequent calls
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @see [dispose]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IDrawingDistanceCalculator%23IDrawingDistanceCalculator-method-initialize">Online Documentation</a>
 */
   fun initialize( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )

companion object : InterfaceMetadata<IDrawingDistanceCalculator> {
}
}
