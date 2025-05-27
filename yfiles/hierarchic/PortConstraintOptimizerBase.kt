// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Edge
import yfiles.algorithms.Node
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutOrientation
import yfiles.layout.MirrorModes

/**
 * This class is an abstract implementation of the [IPortConstraintOptimizer] interface that minimizes the effort required to modify the port assignment after the sequencing phase of hierarchic layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerBase">Online Documentation</a>
 * 
 * @constructor Creates a new [PortConstraintOptimizerBase] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerBase%23PortConstraintOptimizerBase-constructor-PortConstraintOptimizerBase">Online Documentation</a>
 */
external abstract class PortConstraintOptimizerBase 
protected constructor () : IPortConstraintOptimizer {

/**
 * Gets or sets the layout orientation.
 * 
 * Default value - [LayoutOrientation.TOP_TO_BOTTOM]. The layout orientation is top-to-bottom.
 * @see [MultiStageLayout.layoutOrientation][yfiles.layout.MultiStageLayout.layoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerBase%23layoutOrientation">Online Documentation</a>
 */
open var layoutOrientation: LayoutOrientation
/**
 * Gets or sets the mirror mask that defines which orientations should be mirrored.
 * 
 * Default value - [MirrorModes.BOTTOM_TO_TOP]. Layout orientation [LayoutOrientation.BOTTOM_TO_TOP] will be mirrored at the y-axis.
 * @see [OrientationLayout][yfiles.layout.OrientationLayout]
 * @see [LayoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerBase%23mirrorMode">Online Documentation</a>
 */
open var mirrorMode: MirrorModes
/**
 * Inserts a same-layer edge structure for each same-layer edge of the original graph.
 * @param [graph] the input graph
 * @param [layers] the given [ILayers] instance holding the layering information
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [itemFactory] the [factory][IItemFactory] that sets the temporary port constraints
 * @see [IItemFactory.setTemporaryPortConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerBase%23PortConstraintOptimizerBase-method-insertSameLayerStructures">Online Documentation</a>
 */
 open protected   fun insertSameLayerStructures( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory ):PortConstraintOptimizerSameLayerData
/**
 * Assigns new temporary port constraints after the nodes have been assigned to layers.
 * @param [graph] the input graph
 * @param [layers] the given [ILayers] instance holding the layering information
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [itemFactory] the [factory][IItemFactory] that sets the temporary port constraints
 * @see [IItemFactory.setTemporaryPortConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerBase%23PortConstraintOptimizerBase-method-optimizeAfterLayering">Online Documentation</a>
 */
 abstract override   fun optimizeAfterLayering( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )
/**
 * Assigns new temporary port constraints after the order of the nodes in each layer has been determined.
 * @param [graph] the input graph
 * @param [layers] the given [ILayers] instance holding the layering information
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [itemFactory] the [factory][IItemFactory] that sets the temporary port constraints
 * @see [insertSameLayerStructures]
 * @see [optimizeAfterSequencing]
 * @see [removeSameLayerStructures]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerBase%23PortConstraintOptimizerBase-method-optimizeAfterSequencing">Online Documentation</a>
 */
 override   fun optimizeAfterSequencing( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )
/**
 * Assigns new temporary port constraints after the order of the nodes in each layer has been determined.
 * @param [inEdgeOrder] a given [IComparer] instance for incoming edges
 * @param [outEdgeOrder] a given [IComparer] instance for outgoing edges
 * @param [graph] the input graph
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [itemFactory] the [factory][IItemFactory] that sets the temporary port constraints
 * @see [optimizeAfterSequencing]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerBase%23PortConstraintOptimizerBase-method-optimizeAfterSequencingForAllNodes">Online Documentation</a>
 */
 open protected   fun optimizeAfterSequencingForAllNodes( inEdgeOrder: IComparer<in Edge> ,
 outEdgeOrder: IComparer<in Edge> ,
 graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )
/**
 * Assigns new temporary port constraints to a given node of the graph after the order of the nodes in each layer has been determined.
 * @param [node] the original node to set temporary port constraints
 * @param [inEdgeOrder] a given [IComparer] instance for incoming edges
 * @param [outEdgeOrder] a given [IComparer] instance for outgoing edges
 * @param [graph] the input graph
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [itemFactory] the [factory][IItemFactory] that sets the temporary port constraints
 * @see [optimizeAfterSequencing]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerBase%23PortConstraintOptimizerBase-method-optimizeAfterSequencingForSingleNode">Online Documentation</a>
 */
 abstract protected   fun optimizeAfterSequencingForSingleNode( node: Node ,
 inEdgeOrder: IComparer<in Edge> ,
 outEdgeOrder: IComparer<in Edge> ,
 graph: LayoutGraph ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )
/**
 * Removes the same-layer edge structure created using [insertSameLayerStructures].
 * @param [sameLayerData] a given [PortConstraintOptimizerSameLayerData] instance holding the information about the same-layer structures.
 * @param [graph] the input graph
 * @param [ldp] the [ILayoutDataProvider] implementation which provides access to the [INodeData] and [IEdgeData] instances
 * @param [itemFactory] the [factory][IItemFactory] that sets the temporary port constraints
 * @see [IItemFactory.setTemporaryPortConstraint]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortConstraintOptimizerBase%23PortConstraintOptimizerBase-method-removeSameLayerStructures">Online Documentation</a>
 */
 open protected   fun removeSameLayerStructures( sameLayerData: PortConstraintOptimizerSameLayerData ,
 graph: LayoutGraph ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )

companion object : ClassMetadata<PortConstraintOptimizerBase> {
}
}
