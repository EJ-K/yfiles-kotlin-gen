// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.InterfaceMetadata

/**
 * A [ILayoutStage] is a layout algorithm that represents a stage of a larger layout process.
 * @see [MultiStageLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutStage">Online Documentation</a>
 */
external interface ILayoutStage : ILayoutAlgorithm {
/**
 * Gets or sets the core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutStage%23coreLayout">Online Documentation</a>
 */
var coreLayout: ILayoutAlgorithm?

companion object : InterfaceMetadata<ILayoutStage> {
}
}
