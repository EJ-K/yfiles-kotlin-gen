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
import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.NodeList
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * [DelegatingNodePlacer] delegates the arrangement of the children to two different [INodePlacer]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [DefaultNodePlacer] instance with default settings using the given modification matrix and the given node placers as delegates.
 * @param [modificationMatrix] the transformation matrix
 * @param [primaryPlacer] the primary delegate [INodePlacer] which places the left subtrees
 * @param [secondaryPlacer] the secondary delegate [INodePlacer] which places the right subtrees
 * @see [PRIMARY_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer%23DelegatingNodePlacer-constructor-DelegatingNodePlacer">Online Documentation</a>
 * 
 * @property primaryPlacer
 * Gets the [INodePlacer] instance that will arrange the upper-left part of the graph.
 * @see [secondaryPlacer]
 * @see [primaryChildren]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer%23primaryPlacer">Online Documentation</a>
 * 
 * @property secondaryPlacer
 * Gets the [INodePlacer] instance that will arrange the lower-right part of the graph.
 * @see [primaryPlacer]
 * @see [secondaryChildren]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer%23secondaryPlacer">Online Documentation</a>
 */
external open class DelegatingNodePlacer  (
 modificationMatrix: RotatableNodePlacerMatrix ,
open val primaryPlacer: INodePlacer?,
open val secondaryPlacer: INodePlacer?) : RotatableNodePlacerBase {

/**
 * Creates a [IProcessor] that partitions child nodes of the current root node into two subsets.
 * @see [secondaryPlacer]
 * @see [primaryPlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer%23DelegatingNodePlacer-method-createProcessor">Online Documentation</a>
 */
 override   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * Determines a connector direction for the given child node.
 * @throws InvalidOperationError if this method is called
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer%23DelegatingNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Does nothing.
 * @param [localRoot] the local root node
 * @param [connectorMap] the map that must be used for storing the direction specifiers of the child nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer%23DelegatingNodePlacer-method-determineChildConnectors">Online Documentation</a>
 */
 override   fun determineChildConnectors( localRoot: Node ,
 connectorMap: IDataMap<Node, ParentConnectorDirection> )
/**
 * Places the [SubtreeShape]s of the child nodes using the two delegate node placers retrieved with [primaryPlacer] and [secondaryPlacer].
 * @return the merged [SubtreeShape] for the subtree rooted at the local root node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer%23DelegatingNodePlacer-method-placeSubtree">Online Documentation</a>
 */
 override   fun placeSubtree( nodeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 subtreeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 graph: LayoutGraph ,
 localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape
/**
 * Arranges the local root relative to the subtree shape of its children.
 * @throws InvalidOperationError if this method is called
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer%23DelegatingNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):RotatedSubtreeShape
/**
 * Returns all upper-left children of the local root node.
 * @param [localRoot] the local root node
 * @param [graph] the input graph
 * @return the list of upper-left child [Node]s
 * @see [PRIMARY_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer%23DelegatingNodePlacer-method-primaryChildren">Online Documentation</a>
 */
 open protected   fun primaryChildren( localRoot: Node ,
 graph: LayoutGraph ):NodeList
/**
 * Returns all lower-right children of the local root node.
 * @param [localRoot] the local root node
 * @param [graph] the input graph
 * @return the list of lower-right child [Node]s
 * @see [PRIMARY_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer%23DelegatingNodePlacer-method-secondaryChildren">Online Documentation</a>
 */
 open protected   fun secondaryChildren( localRoot: Node ,
 graph: LayoutGraph ):NodeList

companion object : ClassMetadata<DelegatingNodePlacer> {
/**
 * A data provider key for dividing the children into two sets.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DelegatingNodePlacer%23PRIMARY_NODES_DP_KEY">Online Documentation</a>
 */
 val PRIMARY_NODES_DP_KEY: NodeDpKey<Boolean>
}
}
