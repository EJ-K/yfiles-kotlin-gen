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
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.layout.LayoutGraph

/**
 * A [INodePlacer] is responsible for the arrangement of a local root node and all of its subtrees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITreeLayoutNodePlacer">Online Documentation</a>
 */
@JsName("ITreeLayoutNodePlacer")
external interface INodePlacer : YObject {
/**
 * Creates an optional [IProcessor] for pre- and post-processing.
 * @param [layouter] the current [TreeLayout] instance
 * @param [graph] the input graph
 * @param [currentRoot] the root node handled by this [INodePlacer]
 * @return a [IProcessor] instance or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITreeLayoutNodePlacer%23INodePlacer-method-createProcessor">Online Documentation</a>
 */
   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * Provides the direction of the connector to the [SubtreeShape] for each child node.
 * @param [localRoot] the local root node
 * @param [connectorMap] the map that must be used for storing the direction specifiers of the child nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITreeLayoutNodePlacer%23INodePlacer-method-determineChildConnectors">Online Documentation</a>
 */
   fun determineChildConnectors( localRoot: Node ,
 connectorMap: IDataMap<Node, ParentConnectorDirection> )
/**
 * Arranges the [SubtreeShapes][SubtreeShape] of the local root and its children and routes the edges that connect them.
 * @param [nodeShapeProvider] the [IDataProvider] for obtaining an initial shape of the root node
 * @param [subtreeShapeProvider] the [IDataProvider] for accessing the pre-calculated shapes of the subtrees
 * @param [graph] the input graph
 * @param [localRoot] the root of the subtree that should be arranged by this method
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the combined shape of the whole subtree
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITreeLayoutNodePlacer%23INodePlacer-method-placeSubtree">Online Documentation</a>
 */
   fun placeSubtree( nodeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 subtreeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 graph: LayoutGraph ,
 localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape

companion object : InterfaceMetadata<INodePlacer> {
}
}
