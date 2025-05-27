// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * This [layout stage][yfiles.layout.ILayoutStage] can be used for automatically assigning [SwimlaneDescriptor] instances to nodes by treating top-level group nodes as swimlanes.
 * @see [HierarchicLayout]
 * @see [SwimlaneDescriptor]
 * @see [GroupingKeys][yfiles.layout.GroupingKeys]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TopLevelGroupToSwimlaneStage">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [TopLevelGroupToSwimlaneStage] with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TopLevelGroupToSwimlaneStage%23TopLevelGroupToSwimlaneStage-constructor-TopLevelGroupToSwimlaneStage">Online Documentation</a>
 */
external open class TopLevelGroupToSwimlaneStage  () : LayoutStageBase {

/**
 * Gets or sets whether or not the order of the swimlanes should be determined based on the current sketch.
 * 
 * Default value - `false`. The order of the swimlanes is not determined from the current sketch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TopLevelGroupToSwimlaneStage%23orderSwimlanesFromSketch">Online Documentation</a>
 */
open var orderSwimlanesFromSketch: Boolean
/**
 * Gets or sets the spacing between the swimlanes.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TopLevelGroupToSwimlaneStage%23spacing">Online Documentation</a>
 */
open var spacing: Double
/**
 * Calculates the layout by automatically assigning [SwimlaneDescriptor] instances to nodes and treating top-level group nodes as swimlanes.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TopLevelGroupToSwimlaneStage%23TopLevelGroupToSwimlaneStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<TopLevelGroupToSwimlaneStage> {
}
}

inline fun TopLevelGroupToSwimlaneStage(
    block: TopLevelGroupToSwimlaneStage.() -> Unit
): TopLevelGroupToSwimlaneStage {
    return TopLevelGroupToSwimlaneStage()
        .apply(block)
}
