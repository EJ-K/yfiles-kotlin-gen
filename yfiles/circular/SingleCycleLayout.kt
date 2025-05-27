// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.circular

import yfiles.algorithms.INodeSequencer
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.MultiStageLayout

/**
 * This layout algorithm places all nodes of a graph on a single cycle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [SingleCycleLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23SingleCycleLayout-constructor-SingleCycleLayout">Online Documentation</a>
 */
external open class SingleCycleLayout  () : MultiStageLayout {

/**
 * Gets or sets whether or not the radius of the circle should be determined automatically.
 * 
 * Default value - `true`. The radius will be chosen automatically.
 * @see [minimumRadius]
 * @see [fixedRadius]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23automaticRadius">Online Documentation</a>
 */
open var automaticRadius: Boolean
/**
 * Gets or sets a fixed radius for the circle on which the nodes will be placed.
 * 
 * Default value - `200`
 * @throws ArgumentError if the given radius is negative
 * @see [minimumRadius]
 * @see [automaticRadius]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23fixedRadius">Online Documentation</a>
 */
open var fixedRadius: Double
/**
 * Gets or sets whether or not to consider the coordinates of the input diagram when arranging the graph.
 * 
 * Default value - `false`. The coordinates of the input diagram are not considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23fromSketchMode">Online Documentation</a>
 */
open var fromSketchMode: Boolean
/**
 * Gets or sets the angle that describes the location on the circle of the first node.
 * 
 * Default value - `0.0`. The first node is placed east.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23initialAngle">Online Documentation</a>
 */
open var initialAngle: Double
/**
 * Gets the radius that was applied to the last layout calculated by this algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23lastAppliedRadius">Online Documentation</a>
 */
open val lastAppliedRadius: Double
/**
 * Gets or sets the minimum distance between nodes that are next to each other on the circle.
 * 
 * Default value - `30`
 * @throws ArgumentError if the given distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23minimumNodeDistance">Online Documentation</a>
 */
open var minimumNodeDistance: Double
/**
 * Gets or sets the minimum radius for the circle on which the nodes are placed.
 * 
 * Default value - `5.0`
 * @throws ArgumentError if the given minimum radius is negative
 * @see [fixedRadius]
 * @see [automaticRadius]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23minimumRadius">Online Documentation</a>
 */
open var minimumRadius: Double
/**
 * Gets or sets the custom [INodeSequencer] that will be used for determining the order of the nodes for the circle placement.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23nodeSequencer">Online Documentation</a>
 */
open var nodeSequencer: INodeSequencer?
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] that modifies the orientation of the layout is activated.
 * 
 * Default value - `true`. The orientation [ILayoutStage][yfiles.layout.ILayoutStage] is activated.
 * @see [MultiStageLayout.orientationLayoutEnabled]
 * @see [MultiStageLayout.orientationLayout]
 * @see [MultiStageLayout.layoutOrientation]
 * @see [OrientationLayout][yfiles.layout.OrientationLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23orientationLayoutEnabled">Online Documentation</a>
 */
override var orientationLayoutEnabled: Boolean
/**
 * Sets whether or not the [ILayoutStage][yfiles.layout.ILayoutStage] used for routing self-loops is activated.
 * 
 * Default value - `true`. The stage that routes self-loops is activated.
 * @see [MultiStageLayout.selfLoopRouterEnabled]
 * @see [MultiStageLayout.selfLoopRouter]
 * @see [SelfLoopRouter][yfiles.layout.SelfLoopRouter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23selfLoopRouterEnabled">Online Documentation</a>
 */
override var selfLoopRouterEnabled: Boolean
/**
 * Arranges the nodes of the given graph such that they all lie on a common circle.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SingleCycleLayout%23SingleCycleLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )

companion object : ClassMetadata<SingleCycleLayout> {
}
}

inline fun SingleCycleLayout(
    block: SingleCycleLayout.() -> Unit
): SingleCycleLayout {
    return SingleCycleLayout()
        .apply(block)
}
