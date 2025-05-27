// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata
import yfiles.styles.IPortStyle

/**
 * A canonical implementation of the [IPortDefaults] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDefaults">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PortDefaults] class using a trivial location model parameter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDefaults%23PortDefaults-constructor-PortDefaults">Online Documentation</a>
 */
open external class PortDefaults () : IPortDefaults {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDefaults%23autoCleanUp">Online Documentation</a>
   */
  final override var autoCleanUp: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDefaults%23labels">Online Documentation</a>
   */
  final override var labels: ILabelDefaults
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDefaults%23locationParameter">Online Documentation</a>
   */
  final override var locationParameter: IPortLocationModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDefaults%23shareLocationParameterInstance">Online Documentation</a>
   */
  final override var shareLocationParameterInstance: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDefaults%23shareStyleInstance">Online Documentation</a>
   */
  final override var shareStyleInstance: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDefaults%23style">Online Documentation</a>
   */
  final override var style: IPortStyle
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDefaults%23PortDefaults-method-getLocationParameterInstance">Online Documentation</a>
   */
  override fun getLocationParameterInstance(
    owner: IPortOwner,
  ): IPortLocationModelParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDefaults%23PortDefaults-method-getStyleInstance">Online Documentation</a>
   */
  override fun getStyleInstance(
    owner: IPortOwner,
  ): IPortStyle
  
  companion object : ClassMetadata<PortDefaults> {
  }
}

inline fun PortDefaults(
    block: PortDefaults.() -> Unit
): PortDefaults {
    return PortDefaults()
        .apply(block)
}
