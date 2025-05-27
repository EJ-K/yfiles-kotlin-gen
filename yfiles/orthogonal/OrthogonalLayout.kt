// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.orthogonal

import yfiles.algorithms.EdgeDirectedness
import yfiles.algorithms.EdgeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout

/**
 * This layout algorithm arranges graphs in an orthogonal fashion.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [OrthogonalLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23OrthogonalLayout-constructor-OrthogonalLayout">Online Documentation</a>
 */
external open class OrthogonalLayout  () : MultiStageLayout {

/**
 * Gets or sets whether or not degree-one nodes that have the same neighbor should be aligned.
 * 
 * Default value - `false`. Degree-one nodes with the same neighbor are not aligned with each other.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23alignDegreeOneNodes">Online Documentation</a>
 */
open var alignDegreeOneNodes: Boolean
/**
 * Gets or sets the minimum size (number of nodes) a chain needs to have to be detected and handled as a chain substructure.
 * 
 * Default value - `4`
 * @throws ArgumentError if the given minimum size is less than `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23chainSize">Online Documentation</a>
 */
open var chainSize: Int
/**
 * Gets or sets the chain layout style that defines how *chain* substructures are arranged.
 * 
 * Default value - [ChainLayoutStyle.NONE]. Chains are not handled explicitly.
 * @throws ArgumentError if an unknown chain style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23chainStyle">Online Documentation</a>
 */
open var chainStyle: ChainLayoutStyle
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for arranging the components of the graph is activated.
 * 
 * Default value - `true`. The stage that arranges connected graph components is activated.
 * @see [MultiStageLayout.componentLayoutEnabled]
 * @see [MultiStageLayout.componentLayout]
 * @see [ComponentLayout][yfiles.layout.ComponentLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23componentLayoutEnabled">Online Documentation</a>
 */
override var componentLayoutEnabled: Boolean
/**
 * Gets or sets whether or not the layout algorithm considers node labels when calculating node positions to avoid overlaps.
 * 
 * Default value - `false`. Node labels are ignored.
 * @throws InvalidOperationError if no properly configured [LabelLayoutTranslator][yfiles.layout.LabelLayoutTranslator] is registered even though this property was enabled earlier (can happen when manually specifying the [labeling algorithm][MultiStageLayout.labeling]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets whether or not the number of edge crossings should be reduced.
 * 
 * Default value - `true`. The number of edge crossings is reduced.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23crossingReduction">Online Documentation</a>
 */
open var crossingReduction: Boolean
/**
 * Gets or sets the minimum size (number of nodes) a cycle needs to have to be detected and explicitly handled as a cycle substructure.
 * 
 * Default value - `4`
 * @throws ArgumentError if the given minimum size is less than `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23cycleSize">Online Documentation</a>
 */
open var cycleSize: Int
/**
 * Gets or sets the cycle layout style that defines how *cycle* substructures are arranged.
 * 
 * Default value - [CycleLayoutStyle.NONE]. Cycles are not handled explicitly.
 * @throws ArgumentError if an unknown cycle style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23cycleStyle">Online Documentation</a>
 */
open var cycleStyle: CycleLayoutStyle
/**
 * Gets or sets the [EdgeLayoutDescriptor] instance used for all those edges that do not have a specific layout descriptor assigned.
 * 
 * Default value - [EdgeLayoutDescriptor]
 * @see [EDGE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23edgeLayoutDescriptor">Online Documentation</a>
 */
open var edgeLayoutDescriptor: EdgeLayoutDescriptor
/**
 * Gets or sets whether or not the overall edge length should be optimized.
 * 
 * Default value - `true`. The overall edge length is reduced.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23edgeLengthReduction">Online Documentation</a>
 */
open var edgeLengthReduction: Boolean
/**
 * Gets or sets whether or not one face of the embedding of the graph should be maximized.
 * 
 * Default value - `false`. No face of the embedding is maximized.
 * @see [randomization]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23faceMaximization">Online Documentation</a>
 */
open var faceMaximization: Boolean
/**
 * Gets or sets whether or not the existing drawing should be used as a sketch of the resulting orthogonal layout.
 * 
 * Default value - `false`. The initial coordinates of the nodes are not considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23fromSketchMode">Online Documentation</a>
 */
open var fromSketchMode: Boolean
/**
 * Gets or sets the equidistant spacing between the horizontal and vertical grid lines.
 * 
 * Default value - `20`
 * @throws ArgumentError if the grid spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23gridSpacing">Online Documentation</a>
 */
open var gridSpacing: Double
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for hiding group nodes is activated.
 * 
 * Default value - `true`. The stage responsible for hiding group nodes is activated.
 * @see [MultiStageLayout.hideGroupsStageEnabled]
 * @see [MultiStageLayout.hideGroupsStage]
 * @see [HideGroupsStage][yfiles.layout.HideGroupsStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23hideGroupsStageEnabled">Online Documentation</a>
 */
override var hideGroupsStageEnabled: Boolean
/**
 * Gets or sets whether or not the layout algorithm preserves space and places edge labels.
 * 
 * Default value - `false`. Integrated edge labeling is disabled.
 * @throws InvalidOperationError if no properly configured [LabelLayoutTranslator][yfiles.layout.LabelLayoutTranslator] is registered even though integrated labeling was enabled earlier (can happen when manually specifying the [labeling algorithm][MultiStageLayout.labeling]).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23integratedEdgeLabeling">Online Documentation</a>
 */
open var integratedEdgeLabeling: Boolean
/**
 * Gets or sets the layout style for this layout algorithm.
 * 
 * Default value - [LayoutStyle.NORMAL]
 * @throws ArgumentError if an unknown layout style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23layoutStyle">Online Documentation</a>
 */
open var layoutStyle: LayoutStyle
/**
 * Gets or sets the preferred time limit in milliseconds.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The layout algorithm runs unrestricted.
 * @throws ArgumentError if the maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets whether or not the number of perceived bends should be minimized.
 * 
 * Default value - `true`. The number of perceived bends will be minimized.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23optimizePerceivedBends">Online Documentation</a>
 */
open var optimizePerceivedBends: Boolean
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] that modifies the orientation of the layout is activated.
 * 
 * Default value - `true`. The orientation [ILayoutStage][yfiles.layout.ILayoutStage] is activated.
 * @see [MultiStageLayout.orientationLayoutEnabled]
 * @see [MultiStageLayout.orientationLayout]
 * @see [MultiStageLayout.layoutOrientation]
 * @see [OrientationLayout][yfiles.layout.OrientationLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23orientationLayoutEnabled">Online Documentation</a>
 */
override var orientationLayoutEnabled: Boolean
/**
 * Gets or sets whether or not parallel routes for parallel edges (multi-edges) are preferred over independent routes.
 * 
 * Default value - `true`. The algorithm tries to route parallel edges in parallel.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23preferParallelRoutes">Online Documentation</a>
 */
open var preferParallelRoutes: Boolean
/**
 * Gets or sets whether or not a randomization strategy should be performed.
 * 
 * Default value - `true`. A randomization strategy is applied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23randomization">Online Documentation</a>
 */
open var randomization: Boolean
/**
 * Gets or sets the desired orientation for subtree layouts.
 * 
 * Default value - [SubstructureOrientation.AUTO_DETECT]. The tree orientation is determined automatically.
 * @throws ArgumentError if the given layout orientation is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23treeOrientation">Online Documentation</a>
 */
open var treeOrientation: SubstructureOrientation
/**
 * Gets or sets the minimum size (number of nodes) a subtree needs to have to be detected and explicitly handled as a tree substructure.
 * 
 * Default value - `3`
 * @throws ArgumentError if the given minimum size is less than `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23treeSize">Online Documentation</a>
 */
open var treeSize: Int
/**
 * Gets or sets the tree layout style that defines the basic arrangement style for subtrees.
 * 
 * Default value - [TreeLayoutStyle.NONE]. Subtrees are not arranged in a special way.
 * @throws ArgumentError if an unknown tree style is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23treeStyle">Online Documentation</a>
 */
open var treeStyle: TreeLayoutStyle
/**
 * Gets or sets whether or not the layout algorithm should try to obtain a uniform port assignment of the edges incident to the same node side.
 * 
 * Default value - `false`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23uniformPortAssignment">Online Documentation</a>
 */
open var uniformPortAssignment: Boolean
/**
 * Calculates an orthogonal layout for the given graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23OrthogonalLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Calculates an orthogonal layout for the given graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23OrthogonalLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )
/**
 * Returns a new [EdgeLayoutDescriptor] instance that will be used during the various phases of the layout algorithm to determine the drawing details of the edges of the graph.
 * @return a new [EdgeLayoutDescriptor] instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23OrthogonalLayout-method-createEdgeLayoutDescriptor">Online Documentation</a>
 */
 open protected   fun createEdgeLayoutDescriptor():EdgeLayoutDescriptor

companion object : ClassMetadata<OrthogonalLayout> {
/**
 * A data provider key for marking edges which should be routed such that they point to the main layout orientation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23DIRECTED_EDGE_DP_KEY">Online Documentation</a>
 */
 val DIRECTED_EDGE_DP_KEY: EdgeDpKey<Boolean>
/**
 * A data provider key for providing bend costs for each edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23EDGE_BEND_COST_DP_KEY">Online Documentation</a>
 */
 val EDGE_BEND_COST_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for providing crossing costs for each edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23EDGE_CROSSING_COST_DP_KEY">Online Documentation</a>
 */
 val EDGE_CROSSING_COST_DP_KEY: EdgeDpKey<Double>
/**
 * A data provider key for specifying the directedness of edges for the detection of substructures.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23EDGE_DIRECTEDNESS_DP_KEY">Online Documentation</a>
 */
 val EDGE_DIRECTEDNESS_DP_KEY: EdgeDpKey<EdgeDirectedness>
/**
 * A data provider key for providing layout information for each edge.
 * @see [layoutStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalLayout%23EDGE_LAYOUT_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val EDGE_LAYOUT_DESCRIPTOR_DP_KEY: EdgeDpKey<EdgeLayoutDescriptor>
}
}

inline fun OrthogonalLayout(
    block: OrthogonalLayout.() -> Unit
): OrthogonalLayout {
    return OrthogonalLayout()
        .apply(block)
}
