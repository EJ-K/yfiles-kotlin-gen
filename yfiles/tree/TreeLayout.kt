// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import js.array.ReadonlyArray
import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.EdgeList
import yfiles.algorithms.IDataAcceptor
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout
import yfiles.layout.PortConstraint

/**
 * This layout algorithm arranges graphs with a tree structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [TreeLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-constructor-TreeLayout">Online Documentation</a>
 */
external open class TreeLayout  () : MultiStageLayout {

/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for arranging the components of the graph is activated.
 * 
 * Default value - `true`. The stage that arranges connected graph components is activated.
 * @see [MultiStageLayout.componentLayoutEnabled]
 * @see [MultiStageLayout.componentLayout]
 * @see [ComponentLayout][yfiles.layout.ComponentLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23componentLayoutEnabled">Online Documentation</a>
 */
override var componentLayoutEnabled: Boolean
/**
 * Gets or sets whether or not the layout algorithm reserves space for node labels.
 * 
 * Default value - `false`. Node labels are not considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets the default [INodePlacer] instance that places the leaf nodes of the tree.
 * 
 * Default value - [LeafNodePlacer]
 * @throws ArgumentError if the default [INodePlacer] is set to `null`
 * @see [defaultNodePlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23defaultLeafPlacer">Online Documentation</a>
 */
open var defaultLeafPlacer: INodePlacer
/**
 * Gets or sets the default [INodePlacer] instance that arranges all subtrees that do not have a specific [INodePlacer] assigned using a [IDataProvider][yfiles.algorithms.IDataProvider].
 * 
 * Default value - [DefaultNodePlacer]
 * @throws ArgumentError if the default [INodePlacer] is set to `null`
 * @see [NODE_PLACER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23defaultNodePlacer">Online Documentation</a>
 */
open var defaultNodePlacer: INodePlacer
/**
 * Gets or sets the default [IComparer] instance that sorts the outgoing edges in all subtrees that do not have a specific [IComparer] assigned using a [IDataProvider][yfiles.algorithms.IDataProvider].
 * 
 * Default value - `null`. No sorting is executed.
 * @see [OUT_EDGE_COMPARER_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23defaultOutEdgeComparer">Online Documentation</a>
 */
open var defaultOutEdgeComparer: IComparer<in Edge>?
/**
 * Gets or sets the default [IPortAssignment] instance for all subtrees that do not have a specific [IPortAssignment] assigned using a [IDataProvider][yfiles.algorithms.IDataProvider].
 * 
 * Default value - [DefaultPortAssignment]
 * @throws ArgumentError if the default [IPortAssignment] is set to `null`
 * @see [PORT_ASSIGNMENT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23defaultPortAssignment">Online Documentation</a>
 */
open var defaultPortAssignment: IPortAssignment
/**
 * The input graph for which a layout is calculated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23graph">Online Documentation</a>
 */
protected final var graph: LayoutGraph
/**
 * Gets or sets whether or not group nodes are handled by the layout algorithm.
 * 
 * Default value - `true`. Grouping is enabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23groupingSupported">Online Documentation</a>
 */
open var groupingSupported: Boolean
/**
 * Gets or sets whether or not edge labels are placed by the layout algorithm.
 * 
 * Default value - `false`. Edge labels are ignored.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23integratedEdgeLabeling">Online Documentation</a>
 */
open var integratedEdgeLabeling: Boolean
/**
 * Gets or sets whether or not multi-parent structures are allowed for this tree layout.
 * 
 * Default value - `false`. Multi-parent structures are not allowed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23multiParentAllowed">Online Documentation</a>
 */
open var multiParentAllowed: Boolean
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing parallel edges is activated.
 * 
 * Default value - `true`. The stage that routes parallel edges is activated.
 * @see [MultiStageLayout.parallelEdgeRouterEnabled]
 * @see [MultiStageLayout.parallelEdgeRouter]
 * @see [ParallelEdgeRouter][yfiles.router.ParallelEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23parallelEdgeRouterEnabled">Online Documentation</a>
 */
override var parallelEdgeRouterEnabled: Boolean
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing self-loops is activated.
 * 
 * Default value - `true`. The stage that routes self-loops is activated.
 * @see [MultiStageLayout.selfLoopRouterEnabled]
 * @see [MultiStageLayout.selfLoopRouter]
 * @see [SelfLoopRouter][yfiles.layout.SelfLoopRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23selfLoopRouterEnabled">Online Documentation</a>
 */
override var selfLoopRouterEnabled: Boolean
/**
 * Gets a [IDataAcceptor] that can be used for temporarily overwriting the source group information used during the layout.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23sourceGroupDataAcceptor">Online Documentation</a>
 */
protected open val sourceGroupDataAcceptor: IDataAcceptor<Edge, Id>?
/**
 * Gets a [IDataAcceptor] that can overwrite the source [port contraint][PortConstraint] temporarily used during the layout.
 * @see [PortConstraintKeys.SOURCE_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23sourcePortConstraintDataAcceptor">Online Documentation</a>
 */
protected open val sourcePortConstraintDataAcceptor: IDataAcceptor<Edge, PortConstraint>?
/**
 * Gets a [IDataAcceptor] that can be used for temporarily overwriting the target group information used during the layout.
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23targetGroupDataAcceptor">Online Documentation</a>
 */
protected open val targetGroupDataAcceptor: IDataAcceptor<Edge, Id>?
/**
 * Gets a [IDataAcceptor] that can overwrite the target [port contraint][PortConstraint] temporarily used during the layout.
 * @see [PortConstraintKeys.TARGET_PORT_CONSTRAINT_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23targetPortConstraintDataAcceptor">Online Documentation</a>
 */
protected open val targetPortConstraintDataAcceptor: IDataAcceptor<Edge, PortConstraint>?
/**
 * Arranges the given graph as a tree.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )
/**
 * Creates a [SubtreeShape] for the given node that consists only of the bounds of this particular node.
 * @param [node] the given node
 * @return a [SubtreeShape] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-createNodeShape">Online Documentation</a>
 */
 open protected   fun createNodeShape( node: Node ):SubtreeShape
/**
 * Returns a list of edges that need to be reversed in order to obtain a valid rooted and directed tree from the input graph.
 * @return a list of edges that need to be reversed
 * @see [reverseEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-directTree">Online Documentation</a>
 */
 open protected   fun directTree():EdgeList
/**
 * Returns the [INodePlacer] instance that is used for the placement of the local root node and the [SubtreeShape]s.
 * @param [localRoot] the root of the local subtree
 * @return the [INodePlacer] instance that places the subtree below the given local root node
 * @see [NODE_PLACER_DP_KEY]
 * @see [defaultNodePlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-getNodePlacer">Online Documentation</a>
 */
 open protected   fun getNodePlacer( localRoot: Node ):INodePlacer
/**
 * Returns the [IComparer] instance that will sort the outgoing edges connecting to the given node.
 * @param [localRoot] the root of the local subtree
 * @return the [IComparer] or `null` that sorts the outgoing edges of the given node
 * @see [OUT_EDGE_COMPARER_DP_KEY]
 * @see [defaultOutEdgeComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-getOutEdgeComparer">Online Documentation</a>
 */
 open protected   fun getOutEdgeComparer( localRoot: Node ):IComparer<Edge>?
/**
 * Returns the [IPortAssignment] instance that places the ports of the connecting edges of the given node.
 * @param [localRoot] the root of the local subtree
 * @return the [IPortAssignment] instance that assigns the ports of the edges at the given node
 * @see [PORT_ASSIGNMENT_DP_KEY]
 * @see [defaultPortAssignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-getPortAssignment">Online Documentation</a>
 */
 open protected   fun getPortAssignment( localRoot: Node ):IPortAssignment
/**
 * Returns an array of the nodes that will be laid out.
 * @param [root] the node to be considered as root of the tree
 * @return an array of nodes that will be laid out
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-getRootsArray">Online Documentation</a>
 */
 open protected   fun getRootsArray( root: Node ):ReadonlyArray<Node>
/**
 * Provides access to the [SubtreeShape] for the given node.
 * @param [localRoot] the root of the subtree
 * @return the [SubtreeShape] instance if it has already been calculated, `null` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-getSubtreeShape">Online Documentation</a>
 */
 open protected   fun getSubtreeShape( localRoot: Node ):SubtreeShape?
/**
 * Calculates the layout for the given root node and its subtrees.
 * @param [localRoot] the root of the subtree that whose layout is calculated
 * @return the combined [SubtreeShape] of the local root node and all of its children and connecting edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-layoutRoot">Online Documentation</a>
 */
 open protected   fun layoutRoot( localRoot: Node ):SubtreeShape
/**
 * Reverses the direction of given edges.
 * @param [reversedEdges] the edges that will be reversed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23TreeLayout-method-reverseEdges">Online Documentation</a>
 */
 open protected   fun reverseEdges( reversedEdges: EdgeList )

companion object : ClassMetadata<TreeLayout> {
/**
 * A data provider key for defining the priority of critical edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23CRITICAL_EDGE_DP_KEY">Online Documentation</a>
 */
 val CRITICAL_EDGE_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for retrieving descriptors for nodes in multi-parent structures.
 * @see [multiParentAllowed]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23MULTI_PARENT_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val MULTI_PARENT_DESCRIPTOR_DP_KEY: NodeDpKey<MultiParentDescriptor>
/**
 * A data provider key for specifying a child node placer for each node.
 * @see [defaultNodePlacer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23NODE_PLACER_DP_KEY">Online Documentation</a>
 */
 val NODE_PLACER_DP_KEY: NodeDpKey<INodePlacer>
/**
 * A data provider key for specifying the comparator for the outgoing edges.
 * @see [defaultOutEdgeComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23OUT_EDGE_COMPARER_DP_KEY">Online Documentation</a>
 */
 val OUT_EDGE_COMPARER_DP_KEY: NodeDpKey<IComparer<in Edge>>
/**
 * A data provider key for assigning ports to nodes.
 * @see [defaultPortAssignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23PORT_ASSIGNMENT_DP_KEY">Online Documentation</a>
 */
 val PORT_ASSIGNMENT_DP_KEY: NodeDpKey<IPortAssignment>
/**
 * A data provider key for marking the node that will be used as root node of the tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeLayout%23SELECTED_ROOT_DP_KEY">Online Documentation</a>
 */
 val SELECTED_ROOT_DP_KEY: NodeDpKey<Boolean>
}
}

inline fun TreeLayout(
    block: TreeLayout.() -> Unit
): TreeLayout {
    return TreeLayout()
        .apply(block)
}
