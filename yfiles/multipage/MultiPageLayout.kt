// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.IEdgeLabelLayoutDpKey
import yfiles.algorithms.INodeLabelLayoutDpKey
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.YDimension
import yfiles.algorithms.YList
import yfiles.algorithms.YRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.ILayoutStage
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * This layout algorithm subdivides the input graph into several [LayoutGraph]s (called page graphs) such that the layout (calculated by the specified [core layout algorithm][LayoutStageBase.coreLayout]) of each graph fits the [specified maximum page size][maximumPageSize].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [MultiPageLayout] instance.
 * @param [coreLayout] the layout algorithm used for a single page
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MultiPageLayout-constructor-MultiPageLayout">Online Documentation</a>
 */
external open class MultiPageLayout  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the number of additional tree parent [proxies][NodeType.PROXY] that the algorithm tries to place on a page.
 * 
 * Default value - `0`. No additional parent proxies are placed on a page.
 * @throws ArgumentError if the given additional parent count is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23additionalParentCount">Online Documentation</a>
 */
open var additionalParentCount: Int
/**
 * Gets or sets whether or not the algorithm should create [proxy reference nodes][NodeType.PROXY_REFERENCE].
 * 
 * Default value - `true`. The algorithm creates proxy reference nodes.
 * @see [NodeType.PROXY_REFERENCE]
 * @see [NodeType.PROXY]
 * @see [INodeInfo.referencingNode]
 * @see [INodeInfo.representedNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23createProxyReferenceNodes">Online Documentation</a>
 */
open var createProxyReferenceNodes: Boolean
/**
 * Gets or sets the bit mask for defining edge bundles.
 * 
 * Default value - `0`. All multi-edges belong to the same edge bundle.
 * @see [NodeType.CONNECTOR]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23edgeBundleModeMask">Online Documentation</a>
 */
open var edgeBundleModeMask: EdgeBundleModes
/**
 * Gets or sets the [element factory][IElementFactory] for creating special nodes and edges in a multi-page layout.
 * 
 * Default value - [DefaultElementFactory]. If no element factory is set explicitly, the algorithm uses an instance of [DefaultElementFactory].
 * @see [createElementFactory]
 * @see [IElementFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23elementFactory">Online Documentation</a>
 */
open var elementFactory: IElementFactory
/**
 * Gets or sets how to handle special nodes (like connector and proxy nodes) with respect to groups.
 * 
 * Default value - [GroupingMode.ALL_NODES]. Special nodes are also assigned to the associated groups.
 * @throws ArgumentError if the specified group mode is unknown
 * @see [NodeType.CONNECTOR]
 * @see [NodeType.PROXY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23groupingMode">Online Documentation</a>
 */
open var groupingMode: GroupingMode
/**
 * Gets or sets the [ILayoutStage] that places the labels of the input graph.
 * 
 * Default value - [GenericLabeling][yfiles.labeling.GenericLabeling]. An instance of [GenericLabeling][yfiles.labeling.GenericLabeling] with [GenericLabeling.maximumDuration][yfiles.labeling.GenericLabeling.maximumDuration] set to `0`.
 * @see [labelingEnabled]
 * @see [GenericLabeling][yfiles.labeling.GenericLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23labeling">Online Documentation</a>
 */
open var labeling: ILayoutStage
/**
 * Gets or sets whether or not the given [labeling algorithm][labeling] places the labels of the input graph.
 * 
 * Default value - `false`. The given labeling algorithm does not place labels.
 * @see [labeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23labelingEnabled">Online Documentation</a>
 */
open var labelingEnabled: Boolean
/**
 * Gets or sets the [callback][ILayoutCallback] that is notified upon completion of multi-page layout calculation runs.
 * 
 * Default value - `null`. No layout callback is set.
 * @see [ILayoutCallback]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23layoutCallback">Online Documentation</a>
 */
open var layoutCallback: ILayoutCallback?
/**
 * Gets or sets the preferred time limit (in milliseconds) for the layout algorithm.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The layout algorithm runs unrestricted.
 * @throws ArgumentError if the preferred time limit is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the maximum size of a single page.
 * 
 * Default value - `1000x1000`. The width and height of the page are set to `1000`.
 * @throws ArgumentError if the specified width or height is not positive
 * @see [maximumDuration]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23maximumPageSize">Online Documentation</a>
 */
open var maximumPageSize: YDimension
/**
 * Gets or sets whether or not different connected components may be placed on a single page.
 * 
 * Default value - `true`. Different components may be placed on a single page.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23multipleComponentsOnSinglePage">Online Documentation</a>
 */
open var multipleComponentsOnSinglePage: Boolean
/**
 * Gets or sets whether or not the algorithm should separate nodes with different [cluster IDs][NODE_CLUSTER_ID_DP_KEY].
 * 
 * Default value - `false`. Nodes with different cluster IDs may be placed on the same page.
 * @see [NODE_CLUSTER_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23strictClusterSeparation">Online Documentation</a>
 */
open var strictClusterSeparation: Boolean
/**
 * This method is called to further improve the layout results.
 * @param [graph] the input graph
 * @param [incrementalNodesDP] a [IDataProvider] that returns a boolean value indicating whether or not a node is marked; the positions of the non-marked nodes are not allowed to change
 * @param [context] the current layout context
 * @see [LayoutContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MultiPageLayout-method-applyIncrementalLayout">Online Documentation</a>
 */
 open protected   fun applyIncrementalLayout( graph: LayoutGraph ,
 incrementalNodesDP: IDataProvider<Node, Boolean> ,
 context: LayoutContext )
/**
 * Calculates a new multi-page layout for the specified graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MultiPageLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Calculates a new multi-page layout for the specified graph.
 * @param [graph] the input graph
 * @return an instance of [MultiPageLayoutResult] that represents the result of the layout run
 * @throws ArgumentError if for one of the keys [NODE_ID_DP_KEY], [EDGE_ID_DP_KEY], [NODE_LABEL_ID_DP_KEY] and [EDGE_LABEL_ID_DP_KEY] no [IDataProvider] is registered with the given graph
 * @see [MultiPageLayoutResult]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MultiPageLayout-method-calculateLayout">Online Documentation</a>
 */
 open   fun calculateLayout( graph: LayoutGraph ):MultiPageLayoutResult
/**
 * This method creates the [element factory][IElementFactory] for multi-page layouts.
 * @return the created element factory
 * @see [elementFactory]
 * @see [IElementFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MultiPageLayout-method-createElementFactory">Online Documentation</a>
 */
 open protected   fun createElementFactory():IElementFactory
/**
 * This method is called during a postprocessing step that reduces the number of connectors.
 * @param [connector1] the first connector of the connector pair
 * @param [connector2] the second connector of the connector pair
 * @param [originalEdgeIds] the IDs of the original edges that have to be restored
 * @param [context] the current layout context
 * @return `true` if the removal of the connector pair was successful, `false` otherwise
 * @see [routeRestoredEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MultiPageLayout-method-removeConnectorPair">Online Documentation</a>
 */
 open protected   fun removeConnectorPair( connector1: Node ,
 connector2: Node ,
 originalEdgeIds: YList<Id> ,
 context: LayoutContext ):Boolean
/**
 * This method is called whenever some single edges have to be routed without changing the position of nodes (e.g., by [removeConnectorPair] to route the restored edges).
 * @param [graph] the relevant graph
 * @param [selectedEdgesDP] a [IDataProvider] that returns a boolean value indicating whether or not an edge should be rerouted
 * @param [boundingRectangle] the edge routes should be fully contained within this rectangle
 * @see [removeConnectorPair]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23MultiPageLayout-method-routeRestoredEdges">Online Documentation</a>
 */
 open protected   fun routeRestoredEdges( graph: LayoutGraph ,
 selectedEdgesDP: IDataProvider<Edge, Boolean> ,
 boundingRectangle: YRectangle )

companion object : ClassMetadata<MultiPageLayout> {
/**
 * A data provider key for mapping each edge of the input graph to a unique ID.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23EDGE_ID_DP_KEY">Online Documentation</a>
 */
 val EDGE_ID_DP_KEY: EdgeDpKey<Id>
/**
 * A data provider key for mapping each edge label of the input graph to a unique ID.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23EDGE_LABEL_ID_DP_KEY">Online Documentation</a>
 */
 val EDGE_LABEL_ID_DP_KEY: IEdgeLabelLayoutDpKey<Id>
/**
 * A data provider key for specifying the type of multi-edges.
 * @see [EdgeBundleModes.DISTINGUISH_TYPES]
 * @see [edgeBundleModeMask]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23EDGE_TYPE_DP_KEY">Online Documentation</a>
 */
 val EDGE_TYPE_DP_KEY: EdgeDpKey<Any>
/**
 * A data provider key for assigning a cluster ID to common (non-group) nodes.
 * @see [strictClusterSeparation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23NODE_CLUSTER_ID_DP_KEY">Online Documentation</a>
 */
 val NODE_CLUSTER_ID_DP_KEY: NodeDpKey<Id>
/**
 * A data provider key for mapping each node of the input graph to a unique ID.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23NODE_ID_DP_KEY">Online Documentation</a>
 */
 val NODE_ID_DP_KEY: NodeDpKey<Id>
/**
 * A data provider key for mapping each node label of the input graph to a unique ID.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiPageLayout%23NODE_LABEL_ID_DP_KEY">Online Documentation</a>
 */
 val NODE_LABEL_ID_DP_KEY: INodeLabelLayoutDpKey<Id>
}
}

inline fun MultiPageLayout(
    block: MultiPageLayout.() -> Unit
): MultiPageLayout {
    return MultiPageLayout()
        .apply(block)
}
