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
 * Abstract base class implementing [ILayoutStage] that handles the management of the [coreLayout][LayoutStageBase].
 * @see [LayoutStageStack]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutStageBase">Online Documentation</a>
 * 
 * @constructor Initializes a new [LayoutStageBase] instance.
 * @param [coreLayout] The core layout algorithm. The default value is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutStageBase%23LayoutStageBase-constructor-LayoutStageBase">Online Documentation</a>
 * 
 * @property coreLayout
 * Gets or sets the core [ILayoutAlgorithm] that is wrapped by this stage.
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutStageBase%23coreLayout">Online Documentation</a>
 */
abstract external class LayoutStageBase protected constructor(
final override var coreLayout: ILayoutAlgorithm? = definedExternally) : ILayoutStage {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutStageBase%23enabled">Online Documentation</a>
   */
  final override var enabled: Boolean
  
  /**
   * Implementation of the [ILayoutAlgorithm] interface and main entry point for the layout calculation.
   * @param [graph] The graph to apply the layout to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutStageBase%23LayoutStageBase-method-applyLayout">Online Documentation</a>
   */
  final override fun applyLayout(
    graph: LayoutGraph,
  )
  
  /**
   * Abstract method that performs the actual implementation when the stage is [enabled][LayoutStageBase]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutStageBase%23LayoutStageBase-method-applyLayoutImpl">Online Documentation</a>
   */
  protected abstract fun applyLayoutImpl(
    graph: LayoutGraph,
  )
  
  companion object : ClassMetadata<LayoutStageBase> {
  }
}
