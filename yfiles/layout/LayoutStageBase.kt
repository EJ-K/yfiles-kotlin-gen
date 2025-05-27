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
 * Abstract base class implementing [ILayoutStage] that handles the management of the [core layout algorithm][coreLayout].
 * @see [MultiStageLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutStageBase">Online Documentation</a>
 * 
 * @constructor Creates a new [ILayoutStage] instance with an optional [core layout algorithm][coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutStageBase%23LayoutStageBase-constructor-LayoutStageBase">Online Documentation</a>
 * 
 * @property coreLayout
 * Gets or sets the core layout algorithm that is wrapped by this stage.
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutStageBase%23coreLayout">Online Documentation</a>
 */
external abstract class LayoutStageBase  (
override var coreLayout: ILayoutAlgorithm? = definedExternally) : ILayoutStage {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutStageBase%23LayoutStageBase-method-applyLayout">Online Documentation</a>
 */
 abstract override   fun applyLayout( graph: LayoutGraph )
/**
 * Invokes the layout process of the [core layout algorithm][coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutStageBase%23LayoutStageBase-method-applyLayoutCore">Online Documentation</a>
 */
 open protected   fun applyLayoutCore( graph: LayoutGraph )

companion object : ClassMetadata<LayoutStageBase> {
}
}
