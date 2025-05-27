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
 * An [ILayoutStage] is an [ILayoutAlgorithm] that represents a stage of a multi-step layout process.
 * @see [LayoutStageStack]
 * @see [LayoutStageStack.linkCoreLayouts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutStage">Online Documentation</a>
 */
external interface ILayoutStage : ILayoutAlgorithm {
  /**
   * Gets or sets the core layout algorithm.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutStage%23coreLayout">Online Documentation</a>
   */
  var coreLayout: ILayoutAlgorithm?
  
  /**
   * Gets or sets a value that determines whether this stage should do anything but execute the [coreLayout][ILayoutStage].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayoutStage%23enabled">Online Documentation</a>
   */
  var enabled: Boolean

  
  companion object : InterfaceMetadata<ILayoutStage> {
  }
}
