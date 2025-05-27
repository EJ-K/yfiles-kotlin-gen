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
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout

/**
 * This layout algorithm arranges graphs with a tree structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [ClassicTreeLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23ClassicTreeLayout-constructor-ClassicTreeLayout">Online Documentation</a>
 */
external open class ClassicTreeLayout  () : MultiStageLayout {

/**
 * Gets or sets the vertical bus alignment for orthogonally routed edge buses.
 * 
 * Default value - `0.5`. The bus is placed in the middle between parent and child nodes.
 * @throws ArgumentError if `busAlignment` is not in `[0,1]`
 * @see [edgeRoutingStyle]
 * @see [enforceGlobalLayering]
 * @see [leafPlacement]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23busAlignment">Online Documentation</a>
 */
open var busAlignment: Double
/**
 * Gets or sets the [IComparer] instance that is used for sorting the outgoing edges of each node of the tree.
 * 
 * Default value - [IComparer]. An implementation that compares the x-coordinates of the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23comparer">Online Documentation</a>
 */
open var comparer: IComparer<in Edge>?
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for arranging the components of the graph is activated.
 * 
 * Default value - `true`. The stage that arranges connected graph components is activated.
 * @see [MultiStageLayout.componentLayoutEnabled]
 * @see [MultiStageLayout.componentLayout]
 * @see [ComponentLayout][yfiles.layout.ComponentLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23componentLayoutEnabled">Online Documentation</a>
 */
override var componentLayoutEnabled: Boolean
/**
 * Gets or sets whether or not the layout algorithm reserves space for node labels.
 * 
 * Default value - `false`. Node labels are not considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets the edge routing style used by this layout algorithm.
 * 
 * Default value - [EdgeRoutingStyle.PLAIN]. Edges are routed as straight-line segments.
 * @throws ArgumentError if an invalid layout style is provided
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23edgeRoutingStyle">Online Documentation</a>
 */
open var edgeRoutingStyle: EdgeRoutingStyle
/**
 * Gets or sets whether or not a global layering is enforced, that is, each node spans exactly one layer.
 * 
 * Default value - `true`. Global layering is enabled.
 * @see [verticalAlignment]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23enforceGlobalLayering">Online Documentation</a>
 */
open var enforceGlobalLayering: Boolean
/**
 * Gets or sets whether or not group nodes are handled by the layout algorithm.
 * 
 * Default value - `true`. Grouping is enabled.
 * @see [MultiStageLayout.hideGroupsStageEnabled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23groupingSupported">Online Documentation</a>
 */
open var groupingSupported: Boolean
/**
 * Gets or sets whether or not the layout algorithm reserves space for edge labels and places them.
 * 
 * Default value - `false`. Integrated edge labeling is disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23integratedEdgeLabeling">Online Documentation</a>
 */
open var integratedEdgeLabeling: Boolean
/**
 * Gets or sets the layout policy for leaf nodes.
 * 
 * Default value - [LeafPlacement.SIBLINGS_ON_SAME_LAYER]. Sibling nodes are placed on the same layer.
 * @throws ArgumentError if the specified policy is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23leafPlacement">Online Documentation</a>
 */
open var leafPlacement: LeafPlacement
/**
 * Gets or sets the minimum (vertical) distance of the horizontal edge segments of the bus between the root node and the child nodes.
 * 
 * Default value - `0`
 * @throws ArgumentError if the specified distance is smaller than `0`
 * @see [edgeRoutingStyle]
 * @see [portStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23minimumBusSegmentDistance">Online Documentation</a>
 */
open var minimumBusSegmentDistance: Double
/**
 * Gets or sets the minimum length for the first segment of an edge.
 * 
 * Default value - `20`
 * @throws ArgumentError if the minimum segment length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23minimumFirstSegmentLength">Online Documentation</a>
 */
open var minimumFirstSegmentLength: Double
/**
 * Gets or sets the minimum length for the last segment of an edge.
 * 
 * Default value - `20`
 * @throws ArgumentError if the minimum segment length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23minimumLastSegmentLength">Online Documentation</a>
 */
open var minimumLastSegmentLength: Double
/**
 * Gets or sets the minimum distance between two adjacent layers.
 * 
 * Default value - `20`
 * @throws ArgumentError if the given distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23minimumLayerDistance">Online Documentation</a>
 */
open var minimumLayerDistance: Double
/**
 * Gets or sets the minimum horizontal distance between adjacent nodes within the same layer.
 * 
 * Default value - `20`
 * @throws ArgumentError if the given distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23minimumNodeDistance">Online Documentation</a>
 */
open var minimumNodeDistance: Double
/**
 * Gets or sets the modification matrix used for rotating / mirroring the layout.
 * 
 * Default value - [RotatableNodePlacerMatrix.DEFAULT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23modificationMatrix">Online Documentation</a>
 */
open var modificationMatrix: RotatableNodePlacerMatrix
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing parallel edges is activated.
 * 
 * Default value - `true`. The stage that routes parallel edges is activated.
 * @see [MultiStageLayout.parallelEdgeRouterEnabled]
 * @see [MultiStageLayout.parallelEdgeRouter]
 * @see [ParallelEdgeRouter][yfiles.router.ParallelEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23parallelEdgeRouterEnabled">Online Documentation</a>
 */
override var parallelEdgeRouterEnabled: Boolean
/**
 * Gets or sets the port assignment policy that will be applied.
 * 
 * Default value - [PortStyle.NODE_CENTER]. Ports are placed at the center of the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23portStyle">Online Documentation</a>
 */
open var portStyle: PortStyle
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing self-loops is activated.
 * 
 * Default value - `true`. The stage that routes self-loops is activated.
 * @see [MultiStageLayout.selfLoopRouterEnabled]
 * @see [MultiStageLayout.selfLoopRouter]
 * @see [SelfLoopRouter][yfiles.layout.SelfLoopRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23selfLoopRouterEnabled">Online Documentation</a>
 */
override var selfLoopRouterEnabled: Boolean
/**
 * Gets or sets the vertical alignment of the nodes within their corresponding layers.
 * 
 * Default value - `0.5`. Nodes of the same layer are center-aligned.
 * @throws ArgumentError if vertical alignment value does not lie within `[0,1]`
 * @see [enforceGlobalLayering]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23verticalAlignment">Online Documentation</a>
 */
open var verticalAlignment: Double
/**
 * Arranges the given graph as a tree.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23ClassicTreeLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )

companion object : ClassMetadata<ClassicTreeLayout> {
/**
 * A data provider key for marking the node that will be used as root node of the tree.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicTreeLayout%23SELECTED_ROOT_DP_KEY">Online Documentation</a>
 */
 val SELECTED_ROOT_DP_KEY: NodeDpKey<Boolean>
}
}

inline fun ClassicTreeLayout(
    block: ClassicTreeLayout.() -> Unit
): ClassicTreeLayout {
    return ClassicTreeLayout()
        .apply(block)
}
