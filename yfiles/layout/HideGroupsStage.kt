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
 * A [layout stage][ILayoutStage] that hides the group nodes of hierarchically grouped graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HideGroupsStage">Online Documentation</a>
 * 
 * @constructor Creates an instance of [HideGroupsStage] with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HideGroupsStage%23HideGroupsStage-constructor-HideGroupsStage">Online Documentation</a>
 */
external open class HideGroupsStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the [IGroupBoundsCalculator] instance for calculating the sizes of group nodes.
 * 
 * Default value - [MinimumSizeGroupBoundsCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HideGroupsStage%23groupBoundsCalculator">Online Documentation</a>
 */
open var groupBoundsCalculator: IGroupBoundsCalculator?
/**
 * Gets or sets whether or not empty group nodes, i.e., group nodes without children, will be hidden by this stage.
 * 
 * Default value - `true`. All group nodes will be hidden.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HideGroupsStage%23hidingEmptyGroupNodes">Online Documentation</a>
 */
open var hidingEmptyGroupNodes: Boolean
/**
 * Gets or sets whether or not this stage resets the paths of edges incident to group nodes.
 * 
 * Default value - `false`. This stage does not reset the path of edges incident to group nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HideGroupsStage%23resetEdgePaths">Online Documentation</a>
 */
open var resetEdgePaths: Boolean
/**
 * Calculates the layout based on the given core layout algorithm.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HideGroupsStage%23HideGroupsStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Hides the group nodes and their incident edges of the input graph.
 * @param [graph] the input graph
 * @see [GroupingKeys.NODE_ID_DP_KEY]
 * @see [GroupingKeys.PARENT_NODE_ID_DP_KEY]
 * @see [GroupingKeys.GROUP_DP_KEY]
 * @see [unhideGroupNodes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HideGroupsStage%23HideGroupsStage-method-hideGroupNodes">Online Documentation</a>
 */
 open   fun hideGroupNodes( graph: LayoutGraph )
/**
 * Un-hides the group nodes and their incident edges of the input graph that were previously hidden using method [hideGroupNodes].
 * @param [graph] the given graph
 * @see [GroupingKeys.NODE_ID_DP_KEY]
 * @see [GroupingKeys.PARENT_NODE_ID_DP_KEY]
 * @see [GroupingKeys.GROUP_DP_KEY]
 * @see [hideGroupNodes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HideGroupsStage%23HideGroupsStage-method-unhideGroupNodes">Online Documentation</a>
 */
 open   fun unhideGroupNodes( graph: LayoutGraph )

companion object : ClassMetadata<HideGroupsStage> {
}
}

inline fun HideGroupsStage(
    block: HideGroupsStage.() -> Unit
): HideGroupsStage {
    return HideGroupsStage()
        .apply(block)
}
