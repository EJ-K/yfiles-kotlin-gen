// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * An abstract base class for layout algorithms that provides services to simplify and decompose the input graph before it is passed to the [core layout algorithm][applyLayoutCore] itself.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [MultiStageLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23MultiStageLayout-constructor-MultiStageLayout">Online Documentation</a>
 */
external abstract class MultiStageLayout  () : ILayoutAlgorithm {

/**
 * Gets or sets the [ILayoutStage] that arranges the connected components of an input graph.
 * 
 * Default value - [ComponentLayout]
 * @see [componentLayoutEnabled]
 * @see [ComponentLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23componentLayout">Online Documentation</a>
 */
open var componentLayout: ILayoutStage
/**
 * Gets or sets whether or not the [ILayoutStage] used for arranging the components of the graph is activated.
 * 
 * Default value - `true`. The stage that arranges connected graph components is activated.
 * @see [componentLayout]
 * @see [ComponentLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23componentLayoutEnabled">Online Documentation</a>
 */
open var componentLayoutEnabled: Boolean
/**
 * Gets or sets the [ILayoutStage] that hides the group nodes of the input graph.
 * 
 * Default value - [HideGroupsStage]
 * @see [hideGroupsStageEnabled]
 * @see [HideGroupsStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23hideGroupsStage">Online Documentation</a>
 */
open var hideGroupsStage: ILayoutStage
/**
 * Gets or sets whether or not the [ILayoutStage] used for hiding group nodes is activated.
 * 
 * Default value - `true`. The stage responsible for hiding group nodes is activated.
 * @see [hideGroupsStage]
 * @see [HideGroupsStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23hideGroupsStageEnabled">Online Documentation</a>
 */
open var hideGroupsStageEnabled: Boolean
/**
 * Gets or sets the [ILayoutStage] that places the labels of the input graph.
 * 
 * Default value - [GenericLabeling][yfiles.labeling.GenericLabeling]. An instance of [GenericLabeling][yfiles.labeling.GenericLabeling] with [GenericLabeling.maximumDuration][yfiles.labeling.GenericLabeling.maximumDuration] set to `0`.
 * @see [labelingEnabled]
 * @see [GenericLabeling][yfiles.labeling.GenericLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23labeling">Online Documentation</a>
 */
open var labeling: ILayoutStage
/**
 * Gets or sets whether or not the [ILayoutStage] used for placing the labels of the input graph is activated.
 * 
 * Default value - `false`. The stage responsible for label placement is deactivated.
 * @see [labeling]
 * @see [GenericLabeling][yfiles.labeling.GenericLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23labelingEnabled">Online Documentation</a>
 */
open var labelingEnabled: Boolean
/**
 * Gets or sets the main orientation of the layout.
 * 
 * Default value - [LayoutOrientation.TOP_TO_BOTTOM]
 * @throws ArgumentError if the specified orientation does not match a default layout orientation
 * @see [orientationLayout]
 * @see [orientationLayoutEnabled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23layoutOrientation">Online Documentation</a>
 */
open var layoutOrientation: LayoutOrientation
/**
 * Gets or sets the [ILayoutStage] that modifies the orientation of a computed layout.
 * 
 * Default value - [OrientationLayout]
 * @see [orientationLayoutEnabled]
 * @see [layoutOrientation]
 * @see [OrientationLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23orientationLayout">Online Documentation</a>
 */
open var orientationLayout: ILayoutStage
/**
 * Gets or sets whether or not the [ILayoutStage] that modifies the orientation of the layout is activated.
 * 
 * Default value - `true`. The orientation [ILayoutStage] is activated.
 * @see [orientationLayout]
 * @see [layoutOrientation]
 * @see [OrientationLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23orientationLayoutEnabled">Online Documentation</a>
 */
open var orientationLayoutEnabled: Boolean
/**
 * Gets or sets the [ILayoutStage] that routes parallel edges.
 * 
 * Default value - [ParallelEdgeRouter][yfiles.router.ParallelEdgeRouter]
 * @see [parallelEdgeRouterEnabled]
 * @see [ParallelEdgeRouter][yfiles.router.ParallelEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23parallelEdgeRouter">Online Documentation</a>
 */
open var parallelEdgeRouter: ILayoutStage
/**
 * Gets or sets whether or not the [ILayoutStage] used for routing parallel edges is activated.
 * 
 * Default value - `true`. The stage that routes parallel edges is activated.
 * @see [parallelEdgeRouter]
 * @see [ParallelEdgeRouter][yfiles.router.ParallelEdgeRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23parallelEdgeRouterEnabled">Online Documentation</a>
 */
open var parallelEdgeRouterEnabled: Boolean
/**
 * Gets or sets the [ILayoutStage] that routes self-loops.
 * 
 * Default value - [SelfLoopRouter]
 * @see [selfLoopRouterEnabled]
 * @see [SelfLoopRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23selfLoopRouter">Online Documentation</a>
 */
open var selfLoopRouter: ILayoutStage
/**
 * Gets or sets whether or not the [ILayoutStage] used for routing self-loops is activated.
 * 
 * Default value - `true`. The stage that routes self-loops is activated.
 * @see [selfLoopRouter]
 * @see [SelfLoopRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23selfLoopRouterEnabled">Online Documentation</a>
 */
open var selfLoopRouterEnabled: Boolean
/**
 * Gets or sets the [ILayoutStage] that constrains the layout process to a subgraph of the input graph.
 * 
 * Default value - [SubgraphLayout]
 * @see [subgraphLayoutEnabled]
 * @see [SubgraphLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23subgraphLayout">Online Documentation</a>
 */
open var subgraphLayout: ILayoutStage
/**
 * Gets or sets whether or not the [ILayoutStage] used for constraining the layout process to a subgraph of the input graph is activated.
 * 
 * Default value - `false`. The stage that constrains the input graph to a subgraph is deactivated.
 * @see [subgraphLayout]
 * @see [SubgraphLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23subgraphLayoutEnabled">Online Documentation</a>
 */
open var subgraphLayoutEnabled: Boolean
/**
 * Appends the given [ILayoutStage] to the layout pipeline.
 * @param [stage] the [ILayoutStage] instance to be added
 * @see [removeStage]
 * @see [prependStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23MultiStageLayout-method-appendStage">Online Documentation</a>
 */
 open   fun appendStage( stage: ILayoutStage )
/**
 * Calculates a layout for the given graph and applies it directly to the graph.
 * @param [graph] the input graph
 * @see [appendStage]
 * @see [prependStage]
 * @see [applyLayoutCore]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23MultiStageLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Invokes the core layout algorithm.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23MultiStageLayout-method-applyLayoutCore">Online Documentation</a>
 */
 abstract   fun applyLayoutCore( graph: LayoutGraph )
/**
 * Checks the sizes of the nodes to be non-zero.
 * @param [g] The graph to check.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23MultiStageLayout-method-checkNodeSize">Online Documentation</a>
 */
 open protected   fun checkNodeSize( g: LayoutGraph )
/**
 * Deactivates all predefined [ILayoutStage]s so that upon [applyLayout] only the [layout algorithm][applyLayoutCore] will be executed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23MultiStageLayout-method-disableAllStages">Online Documentation</a>
 */
 open   fun disableAllStages()
/**
 * Prepends the given [ILayoutStage] to the layout pipeline.
 * @param [stage] the [ILayoutStage] instance to be added
 * @see [removeStage]
 * @see [appendStage]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23MultiStageLayout-method-prependStage">Online Documentation</a>
 */
 open   fun prependStage( stage: ILayoutStage )
/**
 * Removes the given [ILayoutStage] from the layout pipeline.
 * @param [stage] a [ILayoutStage] to be removed from the layout pipeline
 * @see [prependStage]
 * @see [appendStage]
 * @see [selfLoopRouterEnabled]
 * @see [parallelEdgeRouterEnabled]
 * @see [orientationLayoutEnabled]
 * @see [subgraphLayoutEnabled]
 * @see [labelingEnabled]
 * @see [hideGroupsStageEnabled]
 * @see [componentLayoutEnabled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MultiStageLayout%23MultiStageLayout-method-removeStage">Online Documentation</a>
 */
 open   fun removeStage( stage: ILayoutStage )

companion object : ClassMetadata<MultiStageLayout> {
}
}
