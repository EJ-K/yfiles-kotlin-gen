// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.Edge
import yfiles.algorithms.IDataMap
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * The [AssistantNodePlacer] places nodes that are marked as assistants left and right of their parents and all other nodes below the assistant nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [AssistantNodePlacer] instance that uses the transformation defined by the given matrix.
 * @param [modificationMatrix] the transformation matrix. [RotatableNodePlacerMatrix.DEFAULT] if none is provided.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer%23AssistantNodePlacer-constructor-AssistantNodePlacer">Online Documentation</a>
 */
external open class AssistantNodePlacer  ( modificationMatrix: RotatableNodePlacerMatrix?  = definedExternally) : RotatableNodePlacerBase {

/**
 * Gets or sets the [INodePlacer] instance that places the non-assistant children.
 * 
 * Default value - [SimpleNodePlacer]. A [SimpleNodePlacer] with [centered][RootNodeAlignment.CENTER] local roots is used.
 * @throws ArgumentError if the given child placer is `null` or an instance of class [CompactNodePlacer].
 * @see [ASSISTANT_NODE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer%23childNodePlacer">Online Documentation</a>
 */
open var childNodePlacer: INodePlacer
/**
 * Gets or sets the spacing between subtrees for the delegate [INodePlacer].
 * 
 * Default value - `20`
 * @throws ArgumentError if the given spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer%23spacing">Online Documentation</a>
 */
override var spacing: Double
/**
 * Delegates the creation of [from-sketch comparators][RotatableNodePlacerBase.createFromSketchComparer] to the two [INodePlacer]s handling assistant and non-assistant nodes.
 * @return the [IComparer] to compare edges, considering the initial locations of their target nodes
 * @see [childNodePlacer]
 * @see [createCompoundComparer]
 * @see [IFromSketchNodePlacer.createFromSketchComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer%23AssistantNodePlacer-method-createComparer">Online Documentation</a>
 */
 override   fun createComparer():IComparer<Edge>?
/**
 * Creates a [IProcessor] that prepares the graph for placing assistant node.
 * @param [layouter] the current [TreeLayout] instance
 * @param [graph] the input graph
 * @param [currentRoot] the root node handled by this [INodePlacer]
 * @return the [IProcessor] instance that prepares the graph for [AssistantNodePlacer], or `null` if the out-degree of the given root node is zero
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer%23AssistantNodePlacer-method-createProcessor">Online Documentation</a>
 */
 override   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * Determines a connector direction for the given child node.
 * @throws InvalidOperationError if this method is called
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer%23AssistantNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Delegates the calculation of the child connectors to the [LeftRightNodePlacer] which arranges the assistant nodes.
 * @param [localRoot] the local root node
 * @param [connectorMap] the map that must be used for storing the direction specifiers of the child nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer%23AssistantNodePlacer-method-determineChildConnectors">Online Documentation</a>
 */
 override   fun determineChildConnectors( localRoot: Node ,
 connectorMap: IDataMap<Node, ParentConnectorDirection> )
/**
 * Delegates the arrangement of [SubtreeShape]s to an instance of [LeftRightNodePlacer].
 * @param [nodeShapeProvider] the [IDataProvider] for obtaining an initial shape of the root node
 * @param [subtreeShapeProvider] the [IDataProvider] for accessing the pre-calculated shapes of the subtrees
 * @param [graph] the input graph
 * @param [localRoot] the root of the subtree that should be arranged by this method
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged [SubtreeShape] containing the local root and all assistant nodes and non-assistant nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer%23AssistantNodePlacer-method-placeSubtree">Online Documentation</a>
 */
 override   fun placeSubtree( nodeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 subtreeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 graph: LayoutGraph ,
 localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape
/**
 * Arranges the local root relative to the subtree shape of its children.
 * @throws InvalidOperationError if this method is called
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer%23AssistantNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):RotatedSubtreeShape

companion object : ClassMetadata<AssistantNodePlacer> {
/**
 * A data provider key for marking which nodes are placed as assistants.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer%23ASSISTANT_NODE_DP_KEY">Online Documentation</a>
 */
 val ASSISTANT_NODE_DP_KEY: NodeDpKey<Boolean>
/**
 * Creates a [IComparer] that compares outgoing edges connecting to assistant nodes and edges connecting to non-assistant nodes separately.
 * @param [assistantComparer] the [IComparer] for edges connecting to *assistant* nodes
 * @param [childComparer] the [IComparer] for edges connecting to *non-assistant* nodes
 * @return a [IComparer] that compares edges to assistant nodes separately from edges to non-assistant nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AssistantNodePlacer%23AssistantNodePlacer-method-createCompoundComparer">Online Documentation</a>
 */
 final   fun createCompoundComparer( assistantComparer: IComparer<in Edge> ,
 childComparer: IComparer<in Edge> ):IComparer<Edge>
}
}

inline fun AssistantNodePlacer(
    block: AssistantNodePlacer.() -> Unit
): AssistantNodePlacer {
    return AssistantNodePlacer()
        .apply(block)
}
