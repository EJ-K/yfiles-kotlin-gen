// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.lang.InterfaceMetadata

/**
 * Helper interface used by [ILabelModel] implementations to provide possible candidate [ILabelModelParameter]s for a given label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterProvider">Online Documentation</a>
 */
external interface ILabelModelParameterProvider  {
  /**
   * Returns an enumerator over a set of possible [ILabelModelParameter] instances that can be used for the label whose lookup returned this provider.
   * @return A possibly empty enumerator over a set of label model parameters.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterProvider%23ILabelModelParameterProvider-method-getParameters">Online Documentation</a>
   */
  fun getParameters(): IEnumerable<ILabelModelParameter>

  
  companion object : InterfaceMetadata<ILabelModelParameterProvider> {
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterProvider%23ILabelModelParameterProvider-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      getParameters: () -> IEnumerable<ILabelModelParameter>
    ): ILabelModelParameterProvider
  }
}
