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
 * A [ILayoutStage] that temporarily removes all nodes and edges with `NaN`-coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleNaNCoordinatesStage">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleNaNCoordinatesStage%23HandleNaNCoordinatesStage-constructor-HandleNaNCoordinatesStage">Online Documentation</a>
 */
external open class HandleNaNCoordinatesStage  () : LayoutStageBase {

/**
 * Hides all graph elements with `NaN`-coordinates during [core layout][LayoutStageBase.applyLayoutCore] and restores them afterwards.
 * @param [graph] the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HandleNaNCoordinatesStage%23HandleNaNCoordinatesStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<HandleNaNCoordinatesStage> {
}
}

inline fun HandleNaNCoordinatesStage(
    block: HandleNaNCoordinatesStage.() -> Unit
): HandleNaNCoordinatesStage {
    return HandleNaNCoordinatesStage()
        .apply(block)
}
