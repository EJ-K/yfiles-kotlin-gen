// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.IGroupBoundsCalculator
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout

/**
 * A layout algorithm that arranges graphs in an organic fashion, using a force-directed drawing approach.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [ClassicOrganicLayout] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23ClassicOrganicLayout-constructor-ClassicOrganicLayout">Online Documentation</a>
 */
external open class ClassicOrganicLayout  () : MultiStageLayout {

/**
 * Gets or sets whether or not to arrange subtrees of the input graph in a special, optimized tree style.
 * 
 * Default value - `false`. Subtrees are not handled differently.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23activateTreeBeautifier">Online Documentation</a>
 */
open var activateTreeBeautifier: Boolean
/**
 * Gets or sets the edge attraction value.
 * 
 * Default value - `1`
 * @throws ArgumentError if the attraction value is negative or greater than `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23attraction">Online Documentation</a>
 */
open var attraction: Int
/**
 * Gets or sets whether or not to consider node sizes during layout calculation.
 * 
 * Default value - `true`. Node sizes are considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23considerNodeSizes">Online Documentation</a>
 */
open var considerNodeSizes: Boolean
/**
 * Gets or sets whether or not the deterministic mode of the layout algorithm is enabled.
 * 
 * Default value - `false`. The layout algorithm is non-deterministic.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23deterministic">Online Documentation</a>
 */
open var deterministic: Boolean
/**
 * Gets or sets the absolute, final temperature value, which will cause the algorithm to stop if the average temperature falls under this value.
 * 
 * Default value - `1`
 * @see [initialTemperature]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23finalTemperature">Online Documentation</a>
 */
open var finalTemperature: Double
/**
 * Gets or sets the gravity factor whose magnitude determines the strength of the force towards the barycenter of the graph.
 * 
 * Default value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23gravityFactor">Online Documentation</a>
 */
open var gravityFactor: Double
/**
 * Gets or sets the [IGroupBoundsCalculator] instance used for calculating the size of group nodes.
 * 
 * Default value - [MinimumSizeGroupBoundsCalculator][yfiles.layout.MinimumSizeGroupBoundsCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23groupBoundsCalculator">Online Documentation</a>
 */
open var groupBoundsCalculator: IGroupBoundsCalculator?
/**
 * Gets or sets the compactness of group nodes.
 * 
 * Default value - `0.2`
 * @throws ArgumentError if compactness value does not lie within the interval `[0,1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23groupNodeCompactness">Online Documentation</a>
 */
open var groupNodeCompactness: Double
/**
 * Gets or sets the policy for the handling of group nodes.
 * 
 * Default value - [GroupsPolicy.LAYOUT]
 * @throws ArgumentError if the given policy is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23groupNodePolicy">Online Documentation</a>
 */
open var groupNodePolicy: GroupsPolicy
/**
 * Gets or sets the strategy for the initial placement of nodes.
 * 
 * Default value - [InitialPlacement.ZERO]
 * @throws ArgumentError if the given initial placement mode is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23initialPlacement">Online Documentation</a>
 */
open var initialPlacement: InitialPlacement
/**
 * Gets or sets the initial temperature for the force-directed layout process.
 * 
 * Default value - `0.65`
 * @see [finalTemperature]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23initialTemperature">Online Documentation</a>
 */
open var initialTemperature: Double
/**
 * Gets or sets the iteration factor which influences the maximum number of optimization iterations the algorithm may perform.
 * 
 * Default value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23iterationFactor">Online Documentation</a>
 */
open var iterationFactor: Double
/**
 * Gets or sets the maximum duration in milliseconds that this layout algorithm is allowed to run.
 * 
 * Default value - `30000`
 * @throws ArgumentError if the specified duration has a negative value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] that modifies the orientation of the layout is activated.
 * 
 * Default value - `true`. The orientation [ILayoutStage][yfiles.layout.ILayoutStage] is activated.
 * @see [MultiStageLayout.orientationLayoutEnabled]
 * @see [MultiStageLayout.orientationLayout]
 * @see [MultiStageLayout.layoutOrientation]
 * @see [OrientationLayout][yfiles.layout.OrientationLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23orientationLayoutEnabled">Online Documentation</a>
 */
override var orientationLayoutEnabled: Boolean
/**
 * Gets or sets the default preferred edge length.
 * 
 * Default value - `80`
 * @throws ArgumentError if the specified edge length is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23preferredEdgeLength">Online Documentation</a>
 */
open var preferredEdgeLength: Double
/**
 * Gets or sets the node repulsion value.
 * 
 * Default value - `1`
 * @throws ArgumentError if the repulsion value is negative or greater than `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23repulsion">Online Documentation</a>
 */
open var repulsion: Int
/**
 * Gets or sets the scope that determines which nodes are placed by this algorithm.
 * 
 * Default value - [Scope.ALL]
 * @throws ArgumentError if the given scope is unknown
 * @see [AFFECTED_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23scope">Online Documentation</a>
 */
open var scope: Scope
/**
 * Calculates an organic arrangement of the given graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23ClassicOrganicLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )
/**
 * Frees internal resources which were in use during a previous algorithm run.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23ClassicOrganicLayout-method-dispose">Online Documentation</a>
 */
 open   fun dispose()

companion object : ClassMetadata<ClassicOrganicLayout> {
/**
 * A data provider key for marking the nodes that are part of the current scope.
 * @see [scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23AFFECTED_NODES_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_NODES_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for marking group nodes as fixed.
 * @see [groupNodePolicy]
 * @see [GroupsPolicy.FIXED]
 * @see [GroupsPolicy.LAYOUT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23FIXED_GROUP_NODES_DP_KEY">Online Documentation</a>
 */
 val FIXED_GROUP_NODES_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for defining an individual preferred length for each edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ClassicOrganicLayout%23PREFERRED_EDGE_LENGTH_DP_KEY">Online Documentation</a>
 */
 val PREFERRED_EDGE_LENGTH_DP_KEY: EdgeDpKey<Double>
}
}

inline fun ClassicOrganicLayout(
    block: ClassicOrganicLayout.() -> Unit
): ClassicOrganicLayout {
    return ClassicOrganicLayout()
        .apply(block)
}
