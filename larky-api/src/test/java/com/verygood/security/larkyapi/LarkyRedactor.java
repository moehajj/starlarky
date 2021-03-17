package com.verygood.security.larkyapi;

import java.util.List;
import net.starlark.java.annot.Param;
import net.starlark.java.annot.ParamType;
import net.starlark.java.annot.StarlarkMethod;
import net.starlark.java.eval.NoneType;
import net.starlark.java.eval.StarlarkValue;

public interface LarkyRedactor extends StarlarkValue {
    @StarlarkMethod(
            name = "get",
            doc = "reveals tokenized value",
            parameters = {
                    @Param(
                            name = "value",
                            doc = "token to reveal",
                            allowedTypes = {
                                    @ParamType(type = String.class),
                                    @ParamType(type = List.class, generic1 = String.class)
                            }),
                    @Param(
                            name = "storage",
                            doc = "storage type ('persistent' or 'volatile')",
                            named = true,
                            defaultValue = "None",
                            allowedTypes = {
                                    @ParamType(type=NoneType.class),
                                    @ParamType(type=String.class),
                            })
            })
    Object get(Object value, Object storage);

    @StarlarkMethod(
            name = "put",
            doc = "tokenizes value",
            parameters = {
                    @Param(
                            name = "value",
                            doc = "value to tokenize",
                            allowedTypes = {
                                    @ParamType(type=String.class),
                                    @ParamType(type=List.class, generic1 = String.class)
                            }),
                    @Param(
                            name = "storage",
                            doc = "storage type ('persistent' or 'volatile')",
                            named = true,
                            defaultValue = "None",
                            allowedTypes = {
                                    @ParamType(type=NoneType.class),
                                    @ParamType(type=String.class),
                            }),
                    @Param(
                            name = "format",
                            doc = "standard VGS alias format",
                            named = true,
                            defaultValue = "None",
                            allowedTypes = {
                                    @ParamType(type=NoneType.class),
                                    @ParamType(type=String.class),
                            })
            })
    Object put(Object value, Object storage, Object format);
}