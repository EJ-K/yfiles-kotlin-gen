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
import yfiles.layout.LayoutGraph

/**
 * A [LeafNodePlacer] creates a [SubtreeShape] for a leaf node and routes its incoming edge at the target side.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [LeafNodePlacer] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafNodePlacer%23LeafNodePlacer-constructor-LeafNodePlacer">Online Documentation</a>
 */
external open class LeafNodePlacer  () : INodePlacer {

/**
 * Creates an optional [IProcessor] for pre- and post-processing.
 * @param [layouter] the current [TreeLayout] instance
 * @param [graph] the input graph
 * @param [currentRoot] the root node handled by this [INodePlacer]
 * @return `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafNodePlacer%23LeafNodePlacer-method-createProcessor">Online Documentation</a>
 */
 override   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * Does nothing because leaf nodes don't have children so there are no child connectors.
 * @param [localRoot] the local root node
 * @param [connectorMap] the map that must be used for storing the direction specifiers of the child nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafNodePlacer%23LeafNodePlacer-method-determineChildConnectors">Online Documentation</a>
 */
 override   fun determineChildConnectors( localRoot: Node ,
 connectorMap: IDataMap<Node, ParentConnectorDirection> )
/**
 * Creates a [SubtreeShape] for the local root node (a leaf node in this case) and adds target points to the incoming edge.
 * @param [nodeShapeProvider] the [IDataProvider] for obtaining an initial shape of the root node
 * @param [subtreeShapeProvider] the [IDataProvider] for accessing the pre-calculated shapes of the subtrees
 * @param [graph] the input graph
 * @param [localRoot] the root of the subtree that should be arranged by this method
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the [SubtreeShape] of the leaf node including the connector
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LeafNodePlacer%23LeafNodePlacer-method-placeSubtree">Online Documentation</a>
 */
 override   fun placeSubtree( nodeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 subtreeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 graph: LayoutGraph ,
 localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape

companion object : ClassMetadata<LeafNodePlacer> {
}
}
