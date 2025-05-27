// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.IDataMap
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.lang.ClassMetadata
import yfiles.lang.ICloneable
import yfiles.layout.LayoutGraph

/**
 * Abstract base class for implementations of the [INodePlacer] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodePlacerBase">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [NodePlacerBase].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodePlacerBase%23NodePlacerBase-constructor-NodePlacerBase">Online Documentation</a>
 */
external abstract class NodePlacerBase  () : INodePlacer, ICloneable<NodePlacerBase> {

/**
 * The graph instance this class is working on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodePlacerBase%23graph">Online Documentation</a>
 */
protected final var graph: LayoutGraph
/**
 * Returns a clone of this [INodePlacer] instance.
 * @return an exact copy of this [INodePlacer] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodePlacerBase%23NodePlacerBase-method-clone">Online Documentation</a>
 */
 override   fun clone():NodePlacerBase
/**
 * Creates an optional [IProcessor] for pre- and post-processing.
 * @param [layouter] the current [TreeLayout] instance
 * @param [graph] the input graph
 * @param [currentRoot] the root node handled by this [INodePlacer]
 * @return `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodePlacerBase%23NodePlacerBase-method-createProcessor">Online Documentation</a>
 */
 override   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * Determines a connector direction for the given child node.
 * @param [child] the child node
 * @return a direction specifier as defined in the [INodePlacer] interface
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodePlacerBase%23NodePlacerBase-method-determineChildConnector">Online Documentation</a>
 */
 abstract protected   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Provides the direction of the connector to the [SubtreeShape] for each child node.
 * @param [localRoot] the local root node
 * @param [connectorMap] the map that must be used for storing the direction specifiers of the child nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodePlacerBase%23NodePlacerBase-method-determineChildConnectors">Online Documentation</a>
 */
 override   fun determineChildConnectors( localRoot: Node ,
 connectorMap: IDataMap<Node, ParentConnectorDirection> )
/**
 * Returns the [SubtreeShape] for the given node.
 * @param [node] the node
 * @return the [SubtreeShape] for the given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodePlacerBase%23NodePlacerBase-method-getNodeShape">Online Documentation</a>
 */
 open protected   fun getNodeShape( node: Node ):SubtreeShape?
/**
 * Returns the [SubtreeShape] for the subtree rooted at the given node.
 * @param [node] the local root node
 * @return the [SubtreeShape] of the subtree rooted at the given local root node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodePlacerBase%23NodePlacerBase-method-getSubtreeShape">Online Documentation</a>
 */
 open protected   fun getSubtreeShape( node: Node ):SubtreeShape?
/**
 * Initializes the local data structures and then delegates the work to the abstract variant of this method ([placeSubtreeOfNode])
 * @param [nodeShapeProvider] the [IDataProvider] for obtaining an initial shape of the root node
 * @param [subtreeShapeProvider] the [IDataProvider] for accessing the pre-calculated shapes of the subtrees
 * @param [graph] the input graph
 * @param [localRoot] the root of the subtree that should be arranged by this method
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged [SubtreeShape] for the subtree rooted at the local root node
 * @see [placeSubtreeOfNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodePlacerBase%23NodePlacerBase-method-placeSubtree">Online Documentation</a>
 */
 override   fun placeSubtree( nodeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 subtreeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 graph: LayoutGraph ,
 localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape
/**
 * Arranges the local root relative to the [SubtreeShape] of its children.
 * @param [localRoot] the local root node
 * @param [parentConnectorDirection] the direction of the connector
 * @return a [SubtreeShape] instance that describes the shape of the whole subtree rooted at the given local root
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodePlacerBase%23NodePlacerBase-method-placeSubtreeOfNode">Online Documentation</a>
 */
 abstract protected   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape

companion object : ClassMetadata<NodePlacerBase> {
}
}
